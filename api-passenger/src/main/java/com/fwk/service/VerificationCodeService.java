package com.fwk.service;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @author : fwk
 * @date: 2023/3/14 - 03 - 14 - 17:21
 * @Description: com.fwk.service
 * @version: 1.0
 */
@Service
public class VerificationCodeService {


    public String getVerificationCode(String passengerPhone) throws JSONException {
        //调用验证码服务，获取验证码
        System.out.println("调用验证码服务，获取验证码");

        //存入redis,设置过期时间
        System.out.println("存入redis");

        //返回值
        JSONObject result = new JSONObject();
        result.put("code","1").put("message","success").put("data","verification");
        return result.toString();
    }

}
