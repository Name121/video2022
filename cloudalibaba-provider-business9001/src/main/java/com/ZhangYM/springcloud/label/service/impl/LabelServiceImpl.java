package com.ZhangYM.springcloud.label.service.impl;

import cn.hutool.core.util.IdUtil;
import com.ZhangYM.entities.Label;
import com.ZhangYM.entities.ResponseBean;
import com.ZhangYM.springcloud.label.mapper.LabelMapper;
import com.ZhangYM.springcloud.label.service.LabelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author ZhangYuanMing
 * @create 2022-01-21 14:00
 */
@Service
public class LabelServiceImpl implements LabelService {

    @Resource
    LabelMapper labelMapper;

    @Override
    public ResponseBean insertLabel(Label label) {
        //        if(labelMapper.selectById(label.getLabelName())!=null){
//            return new ResponseBean("标签名已存在","999",null);
//        }
        label.setId(IdUtil.fastSimpleUUID());
        label.setLabelCode(IdUtil.fastSimpleUUID());
        label.setCreateDate(new Date());
        label.setUpdateDate(new Date());
        labelMapper.insertLabel(label);
        return ResponseBean.success();
    }

    @Override
    public ResponseBean deleteLabel(Label label) {
        return null;
    }

    @Override
    public Integer updateLabel(Label label) {
        return null;
    }

    @Override
    public Label getLabel(Label label) {
        return null;
    }

    @Override
    public ResponseBean listLabel(Label label) {
        List<Label> listLabel = labelMapper.listLabel(label);
        return ResponseBean.success(listLabel);
    }
}
