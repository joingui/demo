package com.river.bean;

import java.io.Serializable;

public class ResultResponse<T> implements Serializable {
    public final static String STAUS_SUCCESS = "0"; // 成功状态码0
    public final static String STAUS_xxxEROOR = "1"; // xx状态码1


    private String status = "";
    private String msg = "";
    private T data = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultResponse{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
