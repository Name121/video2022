package com.zhangyuanming.springcloud.controller;

import com.zhangyuanming.entities.Label;
import com.zhangyuanming.entities.ResponseBean;
import com.zhangyuanming.springcloud.service.LabelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 标签操作
 *
 * @author ZhangYuanMing
 * @create 2022-01-21 11:34
 */
@RestController
@RequestMapping("/Label")
public class LabelController {

    @Resource
    private LabelService labelService;

    /**
     * 创建标签
     */
    @PostMapping("/insertLabel")
    public ResponseBean insertLabel(Label label) {
        return labelService.insertLabel(label);
    }

    public ResponseBean deleteLabel(Label label) {
        return null;
    }

    public Integer updateLabel(Label label) {
        return null;
    }

    public Label getLabel(Label label) {
        return null;
    }

    /**
     * 查询所有标签
     * @param label
     * @return
     */
    @PostMapping("/listLabel")
    public ResponseBean listLabel(@RequestBody Label label) {
        return labelService.listLabel(label);
    }
}
