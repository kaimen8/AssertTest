package com.fs.test;

public class AssertTest {
	public static void main(String[] args) {
		int num = 100;
		assert num < 200;
		System.out.println("断言后的代码1");
		assert num > 150 : num = 150;
		System.out.println(num);
		System.out.println("断言后的代码");
	}
}
