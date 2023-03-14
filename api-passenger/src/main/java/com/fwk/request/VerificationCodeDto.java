package com.fwk.request;

/**
 * @author : fwk
 * @date: 2023/3/14 - 03 - 14 - 17:16
 * @Description: com.fwk.request
 * @version: 1.0
 */
public class VerificationCodeDto {

    private String passengerPhone;

    public VerificationCodeDto() {
    }

    public VerificationCodeDto(String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }

    public String getPassengerPhone() {
        return passengerPhone;
    }

    public void setPassengerPhone(String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }
}
