package com.fwk.remote;

import com.fwk.common.ResponseResultDto;
import com.fwk.common.response.NumberCodeResponse;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : fwk
 * @date: 2023/3/15 - 03 - 15 - 15:02
 * @Description: com.fwk.remote
 * @version: 1.0
 */
@FeignClient("service-verificationcode")
public interface ServiceVerificationCodeClient {

    @RequestMapping(method = RequestMethod.GET,value = "/numberCode/{size}")
    ResponseResultDto<NumberCodeResponse> getNumberCode(@RequestParam("size")Integer size);
}
