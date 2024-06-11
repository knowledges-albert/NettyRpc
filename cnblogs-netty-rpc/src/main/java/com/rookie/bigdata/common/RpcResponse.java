package com.rookie.bigdata.common;

/**
 * @Class RpcResponse
 * @Description
 * @Author rookie
 * @Date 2024/6/11 11:20
 * @Version 1.0
 */
public class RpcResponse {

    private String requestId;
    private Throwable error;
    private Object result;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Throwable getError() {
        return error;
    }

    public void setError(Throwable error) {
        this.error = error;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
