package com.fs.test;

public class AssertTest {
	public static void main(String[] args) {
		int num = 100;
		assert num < 200;
		// 注释是我新增的内容：
		// assert 表示后面的条件应该成立，否则就会报断言错误AssertionError
		System.out.println("断言后的代码1");
		assert num > 150 : num = 150;
		System.out.println(num);
		System.out.println("断言后的代码");
	}
}
