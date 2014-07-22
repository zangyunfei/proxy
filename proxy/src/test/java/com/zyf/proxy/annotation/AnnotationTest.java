package com.zyf.proxy.annotation;

import org.junit.Test;

public class AnnotationTest {
	@Test
	public void testRun() {
		DescriptionTest t = CglibProxy.proxyTarget(new DescriptionTest());
		t.run();
	}
}
