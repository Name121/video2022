package com.ZhangYM.entities;

import lombok.Data;

/**
 * 影视文件
 * @author ZhangYuanMing
 * @create 2022-01-21 11:41
 */
@Data
public class Video {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 影视文件编号
     */
    private String  videoCode;
    /**
     * *番号
     */
    private String designation;
    /**
     * *标签编号-关联标签表
     */
    private String labelCode;
    /**
     * 简介
     */
    private String synopsis;
    /**
     * 星级编号-关联星级表
     */
    private String starCode;
    /**
     * 主图-封面
     */
    private String videoMasterPicture;
    /**
     * 精彩截图编号-关联精彩截图表
     */
    private String wonderfulPictureCode;
    /**
     * 索引地址编号-关联索引地址表
     */
    private String videoAddressCode;
    /**
     * 磁链链接-关联磁链链接表
     */
    private String videoUrlCode;
    /**
     * 影片大小
     */
    private String videoSize;
    /**
     * 备注
     */
    private String remark;
    /**
     * 状态 1-正常 2-回收站 3-删除
     */
    private Integer status;
}
