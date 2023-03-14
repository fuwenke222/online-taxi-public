package com.fwk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : fwk
 * @date: 2023/3/14 - 03 - 14 - 16:04
 * @Description: com.fwk.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/passenger")
public class ApiPassengerController {

    @GetMapping("/show")
    @ResponseBody
    public String show(){
        return "哈喽。success";
    }

}
