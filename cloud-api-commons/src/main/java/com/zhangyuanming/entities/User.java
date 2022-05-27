package com.zhangyuanming.entities;

import lombok.Data;

/**
 * @author zhangYM
 * @date 2022-05-19 15:54:14
 */
@Data
public class User {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Integer id;
    /**
     *
     */
    private String userName;
    /**
     *
     */
    private String userPassword;

}
