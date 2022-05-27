package com.zhangyuanming.entities;

import lombok.Data;

import java.util.Date;

/**
 * 标签
 *
 * @author ZhangYuanMing
 * @create 2022-01-21 11:42
 */
@Data
public class Label {
    /**
     * 主键
     */
    private Long id;
    /**
     * 标签名
     */
    private String labelName;
    /**
     * 创建日期
     */
    private Date createDate;
    /**
     * 更新日期
     */
    private Date updateDate;
    /**
     * 备注
     */
    private String remark;
    /**
     * 状态 1-正常 2-删除
     */
    private Integer status;

//    private Integer pageNum;
//    private Integer pageSize;
}
