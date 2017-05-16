package com.myd.web.controller;

import com.myd.utils.Response;
import com.myd.utils.ReturnFormat;
import com.myd.web.model.PersonalTerminal;
import com.myd.web.service.ChatUserGrpMapService;
import com.myd.web.service.PersonalterminalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhugp on 2017/3/29.
 */
@RequestMapping("/chatUser")
@RestController
public class ChatusergrpMapController {

    @Resource
    private ChatUserGrpMapService chatUserGrpMapService;

    @Resource
    private PersonalterminalService personalterminalService;

    @RequestMapping(method = RequestMethod.GET)
    public Response getAllChatUsers(@RequestParam String phoneNum) {
        if (phoneNum.trim().isEmpty()) {
            return ReturnFormat.retParam(2010);
        }
        //该map用于封装群组，以及群组下所有的终端信息
        Map<String, Object> map = new HashMap<String, Object>();
        Map<String, Object> termMap = new HashMap<String, Object>();
        List<String> list = chatUserGrpMapService.selectByPhoneNumDistinct(phoneNum);
        if (list.isEmpty()) {
            return new Response().success("该终端无群组信息");
        }
        for (String groupName : list) {
            termMap.clear();
            List<String> phoneNumList = chatUserGrpMapService.selectByGroupDistinct(groupName);
            if (phoneNumList.contains(phoneNum)) {
                phoneNumList.remove(phoneNum);
            }
            for (String num : phoneNumList) {
                PersonalTerminal p = personalterminalService.selectByPhoneNum(num);
                if (p != null)
                    termMap.put(num, p.getPtname());
            }
            map.put(groupName, termMap);
        }
        return new Response().success(map);
    }

}
