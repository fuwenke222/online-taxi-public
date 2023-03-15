package com.fwk.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author : fwk
 * @date: 2023/3/15 - 03 - 15 - 11:26
 * @Description: com.fwk.common
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ResponseResultDto<T> {
    private Integer code;
    private String message;
    private T data;

    /**
     * 成功响应的方法
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResultDto success(T data){
        return new ResponseResultDto().setCode(CommonStatusEnum.SUCCESS.getCode()).
                setMessage(CommonStatusEnum.SUCCESS.getValue()).
                setData(data);
    }

    /**
     * 失败：统一的失败
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResultDto fail(T data){
        return new ResponseResultDto().setCode(CommonStatusEnum.SUCCESS.getCode()).
                setMessage(CommonStatusEnum.FAIL.getValue()).
                setData(data);
    }

    /**
     * 失败：自定义失败 错误码和提示信息
     * @param code
     * @param message
     * @return
     */
    public static ResponseResultDto fail(int code,String message){
        return new ResponseResultDto().setCode(code).setMessage(message);
    }

    /**
     * 失败：自定义失败 错误码，提示信息，具体错误
     * @param code
     * @param message
     * @param data
     * @return
     */
    public static ResponseResultDto fail(int code,String message,String data){
        return new ResponseResultDto().setCode(code).setMessage(message).setData(data);
    }

}
