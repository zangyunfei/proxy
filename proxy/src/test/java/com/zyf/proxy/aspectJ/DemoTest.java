package com.zyf.proxy.aspectJ;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import base.TestBase;

public class DemoTest extends TestBase {
	@Autowired
	public Demo demo;

	@Test
	public void testProcess() {
		demo.process("ghj", "1");
		Assert.assertTrue(true);
	}
}
