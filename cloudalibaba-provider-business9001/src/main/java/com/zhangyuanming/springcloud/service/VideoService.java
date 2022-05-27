package com.zhangyuanming.springcloud.service;

import com.zhangyuanming.entities.ResponseBean;
import com.zhangyuanming.entities.Video;

/**
 * @author ZhangYuanMing
 * @create 2022-01-21 11:25
 */
public interface VideoService {
    ResponseBean createVideo(Video video);

    ResponseBean updateVideo();

    ResponseBean deleteVideo();
}
