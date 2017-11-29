package com.tyj.jhpt.server.handler;

import com.tyj.jhpt.server.handler.decoder.TYJNewProtocolDeviceRequestDecoder;
import com.tyj.jhpt.server.handler.encoder.TYJDeviceResponseEncoder;
import io.netty.channel.CombinedChannelDuplexHandler;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/3
 */
public class TYJDeviceManagerCodec extends
        CombinedChannelDuplexHandler<TYJNewProtocolDeviceRequestDecoder, TYJDeviceResponseEncoder> {

    public TYJDeviceManagerCodec() {
        super(new TYJNewProtocolDeviceRequestDecoder(), new TYJDeviceResponseEncoder());
    }
}
