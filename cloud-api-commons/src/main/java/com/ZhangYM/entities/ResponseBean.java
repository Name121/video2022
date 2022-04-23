package com.ZhangYM.entities;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ZhangYuanMing
 * @create 2022-01-21 13:46
 */
@Getter
@Setter
public class ResponseBean<T> {
    private String code;
    private String msg;
    private T data;

    public ResponseBean() {
    }

    public ResponseBean(String msg, String code, T data) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public static ResponseBean success() {
        return new ResponseBean("操作成功", "200", null);
    }

    public static<T> ResponseBean success(String msg,T data) {
        return new ResponseBean(msg, "200", data);
    }

    public static<T> ResponseBean success(T data) {
        return new ResponseBean("操作成功", "200", data);
    }

    public static ResponseBean success(String msg) {
        return new ResponseBean(msg, "200", null);
    }

    public static ResponseBean fail() {
        return new ResponseBean("操作失败", "400", null);
    }


    public static<T> ResponseBean fail(String msg,T data) {
        return new ResponseBean(msg, "400", data);
    }

    public static<T> ResponseBean fail(T data) {
        return new ResponseBean("操作失败", "400", data);
    }

    public static ResponseBean fail(String msg) {
        return new ResponseBean(msg, "400", null);
    }

    public static ResponseBean result(String code, String msg, Object data) {
        return new ResponseBean(msg, code, data);
    }
}
