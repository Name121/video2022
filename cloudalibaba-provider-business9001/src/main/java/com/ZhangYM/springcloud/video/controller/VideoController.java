package com.ZhangYM.springcloud.video.controller;

import com.ZhangYM.entities.ResponseBean;
import com.ZhangYM.entities.Video;
import com.ZhangYM.springcloud.video.service.VideoService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 影视文件操作
 * @author ZhangYuanMing
 * @create 2022-01-21 11:24
 */
@RestController
public class VideoController {

    @Resource
    private VideoService videoService;

    /**
     * 添加影视文件
     */
    public ResponseBean createVideo(Video video) {
        return videoService.createVideo(video);
    }

    /**
     * 修改影视文件
     */
    public ResponseBean updateVideo() {
        return videoService.updateVideo();
    }

    /**
     * 删除影视文件
     */
    public ResponseBean deleteVideo() {
        return videoService.deleteVideo();
    }
}
