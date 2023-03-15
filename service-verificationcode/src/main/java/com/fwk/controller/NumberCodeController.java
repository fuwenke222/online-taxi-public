package com.fwk.controller;


import com.fwk.common.ResponseResultDto;
import com.fwk.common.response.NumberCodeResponse;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : fwk
 * @date: 2023/3/15 - 03 - 15 - 9:37
 * @Description: com.fwk.controller
 * @version: 1.0
 */
@RestController
public class NumberCodeController {

    @GetMapping("/numberCode/{size}")
    public ResponseResultDto numberCode(@PathVariable("size") int size){

        //生成验证码
        double mathRandom = (Math.random()*9+1)*(Math.pow(10,size-1));
        int resultInt = (int)mathRandom;
        NumberCodeResponse numberCodeResponse = new NumberCodeResponse(resultInt);
        return ResponseResultDto.success(numberCodeResponse);
    }

}
