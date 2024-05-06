package com.example.BaiPhieuThu_Projeck.Dto;

public class ResultInfoDto {
    public static  final String RESULT_OK = "SUCCESS";
    public static  final String RESULT_NOK = "FAIL";
    public static  final String RESULT_ERROR = "Có lỗi xảy ra";
    public static  final String RESULT_ERR_COMMON = "Có lỗi xảy ra!";

    private Long status;
    private String message;
    private Object data;

    private Object roles;
    private Object totalRecord;
    private Object sumTotalPrice;
    private Long statusReponse;
    private String type;

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getRoles() {
        return roles;
    }

    public void setRoles(Object roles) {
        this.roles = roles;
    }

    public Object getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Object totalRecord) {
        this.totalRecord = totalRecord;
    }

    public Object getSumTotalPrice() {
        return sumTotalPrice;
    }

    public void setSumTotalPrice(Object sumTotalPrice) {
        this.sumTotalPrice = sumTotalPrice;
    }

    public Long getStatusReponse() {
        return statusReponse;
    }

    public void setStatusReponse(Long statusReponse) {
        this.statusReponse = statusReponse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
