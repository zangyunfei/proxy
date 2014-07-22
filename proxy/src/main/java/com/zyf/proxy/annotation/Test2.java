package com.zyf.proxy.annotation;

public class Test2 extends DescriptionTest {

	public static void main(String[] args) {
		Class<Test2> clazz = Test2.class;
		if (clazz.isAnnotationPresent(Description.class)) {

			Description desc = (Description) clazz
					.getAnnotation(Description.class);
			System.out.println("desc.author:" + desc.author());
			System.out.println("desc.size:" + desc.size());
		} else {
			System.out.println("没有在subDescriptionTest上使用注解!");
		}
	}
}
