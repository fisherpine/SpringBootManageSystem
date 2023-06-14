package com.ggbz.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//统一前后端数据
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public static <T> Result<T> success(){
        return new Result<>(20000,"success",null);
    }

    public static <T> Result<T> success(T data){
        return new Result<>(20000,"success",data);
    }

    public static <T> Result<T> success(T data, String message){
        return new Result<>(20000,message,data);
    }


}
