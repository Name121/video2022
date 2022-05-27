package com.zhangyuanming.entities;

import lombok.Data;

/**
 * @author ZhangYuanMing
 * @create 2022-02-23 15:36
 */
@Data
public class Top {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 排行榜编号
     */
    private String topCode;
    /**
     * 影视文件编号
     */
    private String videoCode;
    /**
     * 观影次数
     */
    private Integer watchNumber;
}
