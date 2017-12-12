/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.server.handler;

import com.github.fartherp.framework.common.util.ISOUtil;
import com.github.fartherp.framework.core.bean.ServiceLocator;
import com.tyj.jhpt.server.command.DeviceCommand;
import com.tyj.jhpt.server.message.MessageBean;
import com.tyj.jhpt.service.CompositeDictionaryService;
import com.tyj.jhpt.service.DeviceConfigHistoryService;
import com.tyj.jhpt.service.DeviceGpsInfosErrorService;
import com.tyj.jhpt.service.DeviceGpsInfosService;
import com.tyj.jhpt.service.DeviceInfoService;
import com.tyj.jhpt.service.TradeInfosService;
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
    DeviceGpsInfosErrorService deviceGpsInfosErrorService = ServiceLocator.getInstance().getBean("deviceGpsInfosErrorService");
    DeviceGpsInfosService deviceGpsInfosService = ServiceLocator.getInstance().getBean("deviceGpsInfosService");
    DeviceInfoService deviceInfoService = ServiceLocator.getInstance().getBean("deviceInfoService");
    DeviceConfigHistoryService deviceConfigHistoryService = ServiceLocator.getInstance().getBean("deviceConfigHistoryService");
    TradeInfosService tradeInfosService = ServiceLocator.getInstance().getBean("tradeInfosService");
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

    public DeviceGpsInfosErrorService getDeviceGpsInfosErrorService() {
        return deviceGpsInfosErrorService;
    }

    public DeviceGpsInfosService getDeviceGpsInfosService() {
        return deviceGpsInfosService;
    }

    public DeviceInfoService getDeviceInfoService() {
        return deviceInfoService;
    }

    public DeviceConfigHistoryService getDeviceConfigHistoryService() {
        return deviceConfigHistoryService;
    }

    public TradeInfosService getTradeInfosService() {
        return tradeInfosService;
    }

    public CompositeDictionaryService getCompositeDictionaryService() {
        return compositeDictionaryService;
    }
}
