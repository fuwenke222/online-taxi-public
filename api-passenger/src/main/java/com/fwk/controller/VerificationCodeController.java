package com.fwk.controller;


import com.fwk.common.ResponseResultDto;
import com.fwk.common.VerificationCodeDto;
import com.fwk.common.response.NumberCodeResponse;
import com.fwk.service.VerificationCodeService;
import net.sf.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : fwk
 * @date: 2023/3/14 - 03 - 14 - 17:11
 * @Description: com.fwk.controller
 * @version: 1.0
 */
@RestController
public class VerificationCodeController {

    @Autowired
    private VerificationCodeService verificationCodeService;

    @GetMapping("/verification-code")
    public ResponseResultDto<NumberCodeResponse> verificationCode(@RequestBody VerificationCodeDto verificationCodeDto) throws JSONException {
        String passengerPhone = verificationCodeDto.getPassengerPhone();
        System.out.println("接收到的手机号参数："+passengerPhone);
        return verificationCodeService.getVerificationCode(passengerPhone);
    }
}
