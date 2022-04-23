package com.ZhangYM.springcloud.video.service;

import com.ZhangYM.entities.ResponseBean;
import com.ZhangYM.entities.Video;

/**
 * @author ZhangYuanMing
 * @create 2022-01-21 11:25
 */
public interface VideoService {
    ResponseBean createVideo(Video video);

    ResponseBean updateVideo();

    ResponseBean deleteVideo();
}
