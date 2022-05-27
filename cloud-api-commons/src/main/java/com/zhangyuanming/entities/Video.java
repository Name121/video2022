package com.zhangyuanming.entities;

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
     * 名称
     */
    private String videoName;
    /**
     * 番号
     */
    private String designation;
    /**
     * 标签编号-关联标签表
     */
    private String labelId;
    /**
     * 简介
     */
    private String synopsis;
    /**
     * 星级
     */
    private String star;
    /**
     * 主图-封面
     */
    private byte[] videoMasterPicture;
    /**
     * 关联精彩截图表
     */
    private String wonderfulPictureId;
    /**
     * 关联索引地址表
     */
    private String videoAddressId;
    /**
     * 关联磁链链接表
     */
    private String videoUrlId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 状态 1-正常 2-回收站 3-删除
     */
    private Integer status;
}
