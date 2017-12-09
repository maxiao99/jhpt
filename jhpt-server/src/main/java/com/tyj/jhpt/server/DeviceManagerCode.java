/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server;

import com.tyj.jhpt.server.coder.decoder.DeviceRequestDecoder;
import com.tyj.jhpt.server.coder.encoder.DeviceResponseEncoder;
import io.netty.channel.CombinedChannelDuplexHandler;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/12/7
 */
public class DeviceManagerCode extends CombinedChannelDuplexHandler<DeviceRequestDecoder, DeviceResponseEncoder> {

    public DeviceManagerCode() {
        super(new DeviceRequestDecoder(), new DeviceResponseEncoder());
    }
}
