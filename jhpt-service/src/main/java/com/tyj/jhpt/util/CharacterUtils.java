/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.tyj.jhpt.util;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CharacterUtils {

	public static final String UTF8 = "utf-8";
	public static final String GBK = "gbk";

	public static byte[] encode(String s, String newCharset) {
		Charset cs = Charset.forName(newCharset);
		CharsetEncoder ce = cs.newEncoder();
		try {
			CharBuffer as = CharBuffer.wrap(s);
			// printBuffer(as);
			ByteBuffer encode = ce.encode(as);
			return encode.array();
		} catch (CharacterCodingException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static void printBuffer(CharBuffer cb) {
		// cb.flip();
		while (cb.hasRemaining()) {
			System.out.print(cb.get() + ",");
		}
		cb.flip();
		System.out.println();
	}
}
