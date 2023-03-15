package com.fwk.service;


import com.fwk.common.ResponseResultDto;
import com.fwk.common.response.NumberCodeResponse;
import com.fwk.remote.ServiceVerificationCodeClient;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : fwk
 * @date: 2023/3/14 - 03 - 14 - 17:21
 * @Description: com.fwk.service
 * @version: 1.0
 */
@Service
public class VerificationCodeService {

    @Autowired
    private ServiceVerificationCodeClient serviceVerificationCodeClient;

    public ResponseResultDto<NumberCodeResponse> getVerificationCode(String passengerPhone) throws JSONException {
        //调用验证码服务，获取验证码
        System.out.println("调用验证码服务，获取验证码");

        ResponseResultDto<NumberCodeResponse> numberCodeResponse = serviceVerificationCodeClient.getNumberCode(5);
        Integer numberCode = numberCodeResponse.getData().getNumberCode();
        System.out.println("numberCode = " + numberCode);

        //存入redis
        System.out.println("存入redis");

        //返回值
        /*JSONObject result = new JSONObject();
        result.put("code",1);
        result.put("message","success");
        result.put("data","verification");*/
        return numberCodeResponse;
    }

}
