package com.fwk.common;

import lombok.Data;
import lombok.Getter;

/**
 * @author : fwk
 * @date: 2023/3/15 - 03 - 15 - 11:21
 * @Description: com.fwk.common
 * @version: 1.0
 */
public enum CommonStatusEnum {
    /**
     * 成功
     */
    SUCCESS(1,"success"),
    /**
     * 失败
     */
    FAIL(2,"fail");

    @Getter
    private Integer code;
    @Getter
    private String value;

    CommonStatusEnum() {
    }

    CommonStatusEnum(Integer code, String  value) {
        this.code = code;
        this.value = value;
    }
}
