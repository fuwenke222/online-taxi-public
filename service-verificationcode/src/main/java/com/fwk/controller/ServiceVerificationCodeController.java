package com.fwk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : fwk
 * @date: 2023/3/15 - 03 - 15 - 9:12
 * @Description: com.fwk
 * @version: 1.0
 */
@Controller
public class ServiceVerificationCodeController {

    @RequestMapping("/service-verificationcode")
    public String show(){
        return "/show";
    }
}
