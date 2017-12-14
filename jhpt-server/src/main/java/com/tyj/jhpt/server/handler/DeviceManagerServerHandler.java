/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.handler;

import com.github.fartherp.framework.core.bean.ServiceLocator;
import com.tyj.jhpt.server.command.DeviceCommand;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.service.CompositeDictionaryService;
import com.tyj.jhpt.service.DeviceGpsInfoService;
import com.tyj.jhpt.service.DeviceInfoService;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/3
 */
public class DeviceManagerServerHandler extends ChannelInboundHandlerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(DeviceManagerServerHandler.class);
    DeviceGpsInfoService deviceGpsInfoService = ServiceLocator.getInstance().getBean("deviceGpsInfoService");
    DeviceInfoService deviceInfoService = ServiceLocator.getInstance().getBean("deviceInfoService");
    CompositeDictionaryService compositeDictionaryService = ServiceLocator.getInstance().getBean("compositeDictionaryService");
    Collection<DeviceCommand> beans = ServiceLocator.getInstance().getBeansOfType(DeviceCommand.class).values();

    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        MessageBean mb = (MessageBean) msg;
        for (DeviceCommand command : beans) {
            if (command.support(mb.getCommandFlag())) {
                logger.info("deal commandFlag: {} vin: {}", mb.getCommandFlag(), mb.getVin());
                command.deal(this, mb);
                ctx.writeAndFlush(command.finish(mb));
                logger.info("finish commandFlag: {} vin: {}", mb.getCommandFlag(), mb.getVin());
                ctx.fireChannelRead(mb);
                return;
            }
        }
    }


    public DeviceGpsInfoService getDeviceGpsInfosService() {
        return deviceGpsInfoService;
    }

    public DeviceInfoService getDeviceInfoService() {
        return deviceInfoService;
    }

    public CompositeDictionaryService getCompositeDictionaryService() {
        return compositeDictionaryService;
    }
}
