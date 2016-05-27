package com.yninfo.base.data.base;

/**
 * Created by zhaozhiping on 2016/5/22.
 */
public class ApiResponse<T> {
    private Integer result;
    private String message;
    private T data;

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
