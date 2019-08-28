package com.vip.xiaomi.utils;

import lombok.Data;

/**
 * @author LFZicoo
 * @date 2019/8/22 17:27
 */
@Data
public class Result<T> {
    private int status;
    private String msg;
    private T data;


    public static Result success(Object obj){
        Result result = new Result();
        result.setData(obj);
        result.setMsg(Constants.SUCCESS_MSG);
        result.setStatus(Constants.SUCCESS_STATUS_200);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setStatus(Constants.ERROR_STATUS_404);
        result.setMsg(Constants.ERROR_MSG);
        return result;
    }
}
