/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.tyj.jhpt.util;

import com.tyj.jhpt.bo.DeviceConfigHistory;

import java.util.Calendar;
import java.util.Date;

public class DeviceMsgUtils {

	public static String formatDeviceConfigMsg(int msgId, DeviceConfigHistory dch) {
        StringBuilder sb = new StringBuilder("【天盈健】VD.");
        sb.append(dch.getOverrideVideo());
        sb.append(".");
        sb.append(dch.getCarType());
        sb.append(".");
        sb.append(dch.getVideoLengthBeforeInterrupt());
        sb.append(".");
        sb.append(dch.getVideoLengthAfterInterrupt());
        sb.append(".");
        sb.append(dch.getGpsMsgSendInterval());
        sb.append(".");
        sb.append(getFullHexString(msgId));
        sb.append(",$设备配置提醒，请输入激活码配置设备");
		return sb.toString();
	}

	public static String formatActivateMsg(int deviceId) {
        StringBuilder sb = new StringBuilder();
        sb.append("【天盈健】Act,");
        sb.append(getFullHexString(deviceId));
        sb.append(",$设备激活提醒，请输入激活码激活设备");
		return sb.toString();
	}

	public static String getFullHexString(int deviceId) {
		String x = Integer.toHexString(deviceId);
		if (x.length() < 8) {
			x = repeat("0", 8 - x.length()) + x;
		}
		return x;
	}

	private static String repeat(String string, int i) {
		String re = "";
		for (int j = 0; j < i; j++) {
			re += string;
		}
		return re;
	}

	public static byte[] getTimeArray() {
		Calendar c = Calendar.getInstance();
		byte[] re = new byte[7];
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH) + 1;
		int d = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		re[0] = (byte) (y / 100);
		re[1] = (byte) (y % 100);
		re[2] = (byte) (m);
		re[3] = (byte) (d);
		re[4] = (byte) (hour);
		re[5] = (byte) (minute);
		re[6] = (byte) (second);

		return re;
	}

	public static byte getDriverLicenseType(int type) {
		switch (type) {
            case 1:
                return 0x0a;
            case 2:
                return 0x0b;
            case 3:
                return 0x0c;
		}
		return 0;
	}

	public static byte[] encodePhoneNo(String phoneNo) {
		byte[] re = new byte[6];
		re[0] = 1;
		for (int i = 1; i < phoneNo.length(); i += 2) {
			String va = phoneNo.substring(i, i + 2);
			int parseByte = Integer.parseInt(va, 16);
			re[(i + 1) / 2] = (byte) parseByte;
		}
		return re;
	}

	public static byte[] encodeIdentityNo(String identityNo) {
		byte[] re = new byte[9];
		char lastChar = identityNo.charAt(identityNo.length() - 1);
		if (lastChar == 'X' || lastChar == 'x') {
			identityNo = identityNo.replace(lastChar, 'A');
		}

		for (int i = 0; i < identityNo.length() / 2; i++) {
			String va = identityNo.substring(i * 2, (i + 1) * 2);
			int parseByte = Integer.parseInt(va, 16);
			re[i] = (byte) parseByte;
		}
		return re;
	}

	public static byte[] encodeCarNo(String carNo) {
		byte[] re = new byte[8];
		carNo = carNo.replace(" ", "");
		char firstChar = carNo.charAt(0);
		byte[] encode = CharacterUtils.encode(firstChar + "", CharacterUtils.GBK);
		re[0] = encode[0];
		re[1] = encode[1];
		for (int i = 1; i < carNo.length(); i++) {
			char c = carNo.charAt(i);
			re[1 + i] = (byte) c;
		}
		return re;
	}

	/**
	 * 获取GPS坐标信息 AA BB CC DD 表示int 4个字节，AA为最高位 BB 字节表示度 CC 字节表示分 DD 字节表示秒
	 * 
	 * @param latLong
	 * @return
	 */
	public static double resolveGPSInfo(int latLong) {
		double re = 0xff & (latLong >> 16);
		re += (0xff & (latLong >> 8)) / 60.0;
		re += (0xff & latLong) / 3600.0;
		return re;
	}

    public static Float parseAcceleration(byte[] content, int offset) {
        int a = 0xff & content[offset];
        return (float) (a * 1.0 / 10);
    }

    public static double readLatLongInfo(byte[] content, int offset) {
        long value = (0xff000000L & (content[offset] << 24))
                + (0xff0000L & (content[offset + 1] << 16))
                + (0xff00L & (content[offset + 2] << 8))
                + (0xffL & content[offset + 3]);
        return value * 1.0 / 10000000;
    }

    public static Date resolveTime(byte[] content, int offset) {
        Calendar c = Calendar.getInstance();
        int year = ((0xff & content[0 + offset]) << 8) + (0xff & content[1 + offset]);
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, (0xff & content[2 + offset]) - 1);
        c.set(Calendar.DAY_OF_MONTH, (0xff & content[3 + offset]));
        c.set(Calendar.HOUR_OF_DAY, (0xff & content[4 + offset]));
        c.set(Calendar.MINUTE, (0xff & content[5 + offset]));
        c.set(Calendar.SECOND, (0xff & content[6 + offset]));
        return c.getTime();
    }
}
