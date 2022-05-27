package com.zhangyuanming.springcloud.mapper;

import com.zhangyuanming.entities.Label;
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
     *
     * @param label
     * @return
     */
    Integer insert(Label label);

    /**
     * 删除单个标签
     *
     * @param label
     * @return
     */
    Integer deleteLabel(Label label);

    /**
     * 更新单个标签
     *
     * @param label
     * @return
     */
    Integer updateLabel(Label label);

    /**
     * 查询单个标签
     *
     * @param label
     * @return
     */
    Label getLabel(Label label);

    /**
     * 查询所有标签
     *
     * @param label
     * @return
     */
    List<Label> listLabel(Label label);
}
