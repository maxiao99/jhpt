/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.server;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import static org.testng.Assert.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2018/1/14
 */
public class DeviceManagerServerTest {
    @Test
    public void testMain() throws Exception {
        try {
            //创建Socket对象
            Socket socket = new Socket("localhost", 1443);

            //根据输入输出流和服务端连接
            OutputStream outputStream = socket.getOutputStream();//获取一个输出流，向服务端发送信息
            PrintWriter printWriter = new PrintWriter(outputStream);//将输出流包装成打印流
//            printWriter.print("232301FE4C5244533650454233485230303233353002001F12010E091C0000013839383630304D465353595947313233343536500000308A");
            printWriter.print("23230CDD0F2C40601CE84D107170C365DA15603C07B14C09445EFFE5D3637EDF861CEF8FEBD77425E7EE160FE29F0355019317FC1270564C");
            printWriter.flush();
            socket.shutdownOutput();//关闭输出流

            InputStream inputStream = socket.getInputStream();//获取一个输入流，接收服务端的信息
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);//包装成字符流，提高效率
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//缓冲区
            String info = "";
            String temp = null;//临时变量
            while ((temp = bufferedReader.readLine()) != null) {
                info += temp;
                System.out.println("客户端接收服务端发送信息：" + info);
            }

            //关闭相对应的资源
            bufferedReader.close();
            inputStream.close();
            printWriter.close();
            outputStream.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}