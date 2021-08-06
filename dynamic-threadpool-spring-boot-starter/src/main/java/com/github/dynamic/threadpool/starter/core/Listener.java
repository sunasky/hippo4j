package com.github.dynamic.threadpool.starter.core;

import java.util.concurrent.Executor;

/**
 * 监听器
 *
 * @author chen.ma
 * @date 2021/6/22 20:20
 */
public interface Listener {

    /**
     * 获取执行器
     *
     * @return
     */
    Executor getExecutor();

    /**
     * 接受配置信息
     *
     * @param configInfo
     */
    void receiveConfigInfo(String configInfo);
}