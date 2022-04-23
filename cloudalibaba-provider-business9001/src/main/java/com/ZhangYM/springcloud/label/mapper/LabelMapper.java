package com.ZhangYM.springcloud.label.mapper;

import com.ZhangYM.entities.Label;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ZhangYuanMing
 * @create 2022-01-21 14:45
 */
@Mapper
public interface LabelMapper {

    /**
     * 新增单个标签
     */
    Integer insertLabel(Label label);

    /**
     * 删除单个标签
     */
    Integer deleteLabel(Label label);

    /**
     * 更新单个标签
     */
    Integer updateLabel(Label label);

    /**
     * 查询单个标签
     */
    Label getLabel(Label label);

    /**
     * 查询所有标签
     */
    List<Label> listLabel(Label label);
}
