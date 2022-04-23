package com.ZhangYM.springcloud.label.service;

import com.ZhangYM.entities.Label;
import com.ZhangYM.entities.ResponseBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangYuanMing
 * @create 2022-01-21 13:44
 */
public interface LabelService {

    /**
     * 新增单个标签
     */
    ResponseBean insertLabel(Label label);

    /**
     * 删除单个标签
     */
    ResponseBean deleteLabel(Label label);

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
    ResponseBean listLabel(Label label);
}
