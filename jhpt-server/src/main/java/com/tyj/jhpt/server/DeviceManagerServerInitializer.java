/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server;

import com.tyj.jhpt.server.handler.DeviceManagerServerHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/3
 */
public class DeviceManagerServerInitializer extends ChannelInitializer<SocketChannel> {

    public void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline p = ch.pipeline();
        p.addLast("readTimeout", new ReadTimeoutHandler(SystemConfig.getInt("readTimeOutSeconds")));
        p.addLast("codec", new DeviceManagerCode());
        p.addLast("handler", new DeviceManagerServerHandler());
    }
}
