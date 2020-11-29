package com.twingao.istio.utils;

public class JsonResult {

	public static final String OK_CODE = "0";
	public static final String OK_MSG = "SUCCESS";

	public static final String NOT_DATA_CODE = "1";
	public static final String NOT_DATA_MSG = "NOT DATA";

	public static final String UNKNOWN_ERROR_CODE = "999";
	public static final String UNKNOWN_ERROR_MSG = "UNKNOWN ERROR";
	
    private String code;
    private String message;
    private Object data;

    public JsonResult() {

    }    
    
    public JsonResult(Object data) {
        this.code = OK_CODE;
        this.message = OK_MSG;
        this.data = data;
    }

    public JsonResult(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
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
}