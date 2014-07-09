package com.zyf.proxy.cglib;

import org.junit.Assert;
import org.junit.Test;

public class CglibProxyTest {
	@Test
	public void testCglib() throws Exception {
		Dog dog = CglibProxy.proxyTarget(new Dog());
		dog.eat();
		Assert.assertTrue(true);
	}
}
