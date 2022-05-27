package com.zhangyuanming.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.zhangyuanming.entities.Label;
import com.zhangyuanming.entities.ResponseBean;
import com.zhangyuanming.springcloud.mapper.LabelMapper;
import com.zhangyuanming.springcloud.service.LabelService;
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
        Label query = new Label();
        query.setLabelName(label.getLabelName());
        if (labelMapper.getLabel(query) != null) {
            return new ResponseBean("标签名已存在", "601", null);
        }
        label.setId(IdUtil.getSnowflake(1,1).nextId());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = sdf.format(new Date());
//        System.out.println(format);
        label.setCreateDate(new Date());
        label.setUpdateDate(new Date());
        labelMapper.insert(label);
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
