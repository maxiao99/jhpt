/*
 * Copyright (c) 2018. CK. All rights reserved.
 */

package com.tyj.jhpt.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2018/1/14
 */
public class DeviceManagerServerTest {


    public static void main(String[] args) {
//        testOne();
//        testTwo();
//        testFour();
//        testFive();
//        testSix();
//        testSeven();
//        testEight();
//        testNine();
    }

    public static void testOne() {
        String data = "232301FE4C5244533650454233485230303233353004001F868963ED59DEE01CD2DF6362DDB7303C3731E4627759ECA5849907ACB82FE1B9AF";
        send(data);
    }

    public static void testTwo() {
        String data = "232302FE4C5244533650454233485230303233353004002199739D352A5B72027A3A18001B121A8B064533B5621BAA2E85E90B23F17353AB5D9403E84465B65CF0";
        send(data);
    }

    public static void testFour() {
        String data = "232304FE4C5244533650454233485230303233353004000863A5FC21100C1665C7";
        send(data);
    }

    public static void testFive() {
        String data = "232307FE4C52445336504542334852303032333530040001076A2DC457BA4A841E";
        send(data);
    }

    public static void testSix() {
        String data = "232308FE4C52445336504542334852303032333530040006076A2DC457BA4A8416";
        send(data);
    }

    public static void testSeven() {
        String data = "232309FE4C5244533650454233485230303233353004001A22CA8B519CCDC4D050D6B4E29051468FEA728FAC616F58598DF8F4E62C91D1BC00";
        send(data);
    }

    public static void testEight() {
        String data = "23230AFE4C5244533650454233485230303233353004000A60157ACC0C26039B34B145CFDBAC123A9E";
        send(data);
    }

    public static void testNine() {
        String data = "23230BFE4C5244533650454233485230303233353004005722CA8B519CCDC4D0D7B7A1D3F25111B933E56F0C21B4D67C30AC9ADA590759EFE805BF991595B1E9076A2DC457BA4A84303E13AC3E5709A8183309DA58A8BFAF8C43FFE51BB70D1D69D1D0823D5049561627CCC56055B2C46C";
        send(data);
    }

    public static void send(String data) {
        try {
            //创建Socket对象
            Socket socket = new Socket("localhost", 1443);

            //根据输入输出流和服务端连接
            OutputStream outputStream = socket.getOutputStream();//获取一个输出流，向服务端发送信息
            PrintWriter printWriter = new PrintWriter(outputStream);//将输出流包装成打印流
//            printWriter.print("232301FE4C5244533650454233485230303233353002001F12010E091C0000013839383630304D465353595947313233343536500000308A");
            printWriter.print(data);
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