package com.myd.web.controller;

import com.myd.utils.Response;
import com.myd.web.model.PersonalTerminal;
import com.myd.web.service.PersonalterminalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by zhugp on 2017/3/15.
 */
@Controller
@RequestMapping(value = "/term")
@RestController
public class PersonalterminalController {
    private static final Logger logger = LoggerFactory.getLogger(PersonalterminalController.class);

    @Resource
    private PersonalterminalService personalterminalService;

    @RequestMapping(value = "/Terms", method = RequestMethod.GET)
    public Response getAllTerm() {
        logger.info("终端调用/term/Terms接口，无传入参数");
        List<PersonalTerminal> list = personalterminalService.selectList();
        return new Response().success(list);
    }

    /**
     * 获取用户当前位置接口
     * @param ptId  终端Id
     * @return      终端当前经纬度
     */
    @RequestMapping(value = "/location", method = RequestMethod.GET)
    public Response getTermLocation(@RequestParam String ptId) {
        Map map = personalterminalService.selectByIdAsJdbc(ptId);
        return new Response().success(map);
    }
}
