package com.swn.projectmanagesystem.result;

import lombok.Data;

@Data
public class Result<T> {
    private int code = 200;
    private String message;
    private T result;		    //数据


    public Result(int code,String message){
        this.code = code;
        this.message = message;
    }

    /**
     * 设置错误信息和状态
     * */
    public static <T> Result<T> fail(String message){
        return fail(201, message);
    }

    /**
     * 设置错误信息和状态
     * */
    public static <T> Result<T> fail(int status,String message){
        return new Result<T>(status, message);
    }

    /**
     * 设置错误信息和状态
     * */
    public static <T> Result<T> success(T t){
        Result<T> result =  fail(200,"处理成功！");
        result.setResult(t);
        return result;
    }
}
