package com.project.wxsell.util;

import java.util.Random;

public class KeyUtil {

	public static String uniqueKey() {
		Random random = new Random();
		Integer number = random.nextInt(900000) + 100000;
		return System.currentTimeMillis() + String.valueOf(number);
	}
}
