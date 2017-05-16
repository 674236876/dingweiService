package com.myd.web.controller;

import com.myd.core.annotation.Authorization;
import com.myd.utils.Response;
import com.myd.utils.ReturnFormat;
import com.myd.web.service.PersonalterminalService;
import com.myd.web.service.TokenService;
import com.myd.web.service.UserService;
import com.myd.web.tokens.model.TerminalToken;
import com.myd.web.tokens.model.UserToken;
import com.myd.web.tokens.service.TerminalTokenService;
import com.myd.web.tokens.service.UserTokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by zhugp on 2017/3/28.
 */
@RequestMapping("/login")
@RestController
public class TokenController {

    private static final Logger logger = LoggerFactory.getLogger(TokenController.class);

    @Resource
    private PersonalterminalService personalterminalService;

    @Resource
    private TokenService tokenService;

    @Resource
    private UserTokenService userTokenService;

    @Resource
    private TerminalTokenService terminalTokenService;

    @Resource
    private UserService userService;

    /**
     * 客户端登录接口
     *
     * @param imsi imsi
     * @return 验证结果包含(token, ptid, 电话号码, 名称)
     */
    @RequestMapping(value = "/termLogin", method = RequestMethod.POST)
    public Response login(@RequestParam String imsi) {
        logger.info("终端调用/login接口，传入参数：imsi=" + imsi);
        Assert.notNull(imsi, "imsi can not be empty");
        if (imsi.trim().isEmpty()) {
            return ReturnFormat.retParam(2010);
        }
        Map termMap = personalterminalService.selectByImsiAsJdbc(imsi);
        if (termMap == null) {
            return ReturnFormat.retParam(3003);
        }
        if (1 != Integer.parseInt(termMap.get("ISACTIVE").toString())) {
            return ReturnFormat.retParam(3004);
        }
        TerminalToken model = terminalTokenService.createToken(termMap.get("PTID").toString());
        model.setPhoneNum(termMap.get("NAME").toString());
        model.setPtName(termMap.get("PHONENUMBER").toString());
        return new Response().success(model);
    }

    /**
     * 终端管理系统登录接口
     *
     * @param loginName 用户名
     * @param password  密码
     * @return 验证结果
     */
    @RequestMapping(value = "/sysLogin", method = RequestMethod.POST)
    public Response login(@RequestParam String loginName, String password) {
        if (loginName.trim().isEmpty() || password.trim().isEmpty()) {
            return ReturnFormat.retParam(2010);
        }
        Map userMap = userService.selectByLoginName(loginName, password);
        if (userMap == null) {
            return ReturnFormat.retParam(1010);
        }
        String userId = (String) userMap.get("OPTID");
        String displayName = (String) userMap.get("DISPLAYNAME");
        String entId = (String) userMap.get("ENTID");
        String entName = (String) userMap.get("NAME");
        UserToken model = userTokenService.createToken(userId);
        model.setDisplayName(displayName);
        model.setEntId(entId);
        model.setEntName(entName);
        return new Response().success(model);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @Authorization
    public Response logout(@RequestParam String ptId) {
        logger.info("终端调用/login接口，传入参数：ptId" + ptId);
        if (ptId.trim().isEmpty()) {
            return ReturnFormat.retParam(2010);
        }
        tokenService.deleteToken(ptId);
        return new Response().success();
    }



//    注释原因：此方法使用新表验证登录，暂时使用旧定位表做验证，故注释
//    @RequestMapping(method = RequestMethod.POST)
//    public Response login(@RequestParam String imsi) {
//        logger.info("终端调用/login接口，传入参数：imsi=" + imsi);
//        Assert.notNull(imsi, "imsi can not be empty");
//        if (imsi.trim().isEmpty()) {
//            return ReturnFormat.retParam(2010);
//        }
//        PersonalTerminal perTerm = personalterminalService.selectByImsi(imsi);
//        if (perTerm == null) {
//            return ReturnFormat.retParam(3003);
//        }
//        if (perTerm.getActive() != 1) {
//            return ReturnFormat.retParam(3004);
//        }
//        Token model = tokenService.createToken(perTerm.getId().toString());
//        return new Response().success(model);
//    }
}
