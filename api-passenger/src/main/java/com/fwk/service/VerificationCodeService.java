package com.fwk.service;


import com.fwk.common.ResponseResultDto;
import com.fwk.common.response.NumberCodeResponse;
import com.fwk.remote.ServiceVerificationCodeClient;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author : fwk
 * @date: 2023/3/14 - 03 - 14 - 17:21
 * @Description: com.fwk.service
 * @version: 1.0
 */
@Service
public class VerificationCodeService {

    //乘客验证码的前缀
    private String verificationCodePrefix = "passenger-verification-code";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private ServiceVerificationCodeClient serviceVerificationCodeClient;

    public ResponseResultDto<NumberCodeResponse> getVerificationCode(String passengerPhone) throws JSONException {
        //调用验证码服务，获取验证码

        ResponseResultDto<NumberCodeResponse> numberCodeResponse = serviceVerificationCodeClient.getNumberCode(6);
        Integer numberCode = numberCodeResponse.getData().getNumberCode();

        //存入redis
        //key,value,ttl(过期时间)
        String key = verificationCodePrefix+passengerPhone;
        stringRedisTemplate.opsForValue().set(key,numberCodeResponse.getData().getNumberCode()+"",2, TimeUnit.MINUTES);

        //通知短信服务商，将对应的验证码发送到手机上，短信服务商：阿里短信服务，腾讯短信同，华信，容联

        //返回值
        /*JSONObject result = new JSONObject();
        result.put("code",1);
        result.put("message","success");
        result.put("data","verification");*/
        return ResponseResultDto.success();
    }

}
