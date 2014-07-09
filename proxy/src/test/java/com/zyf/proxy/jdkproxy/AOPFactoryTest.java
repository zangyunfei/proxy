package com.zyf.proxy.jdkproxy;

import org.junit.Assert;
import org.junit.Test;

import com.zyf.proxy.jdkproxy.AOPFactory;
import com.zyf.proxy.jdkproxy.Play;

public class AOPFactoryTest {
	@Test
	public void testGetAOPProxyedObject() {
		Play play = (Play) AOPFactory
				.getAOPProxyedObject("com.zyf.proxy.invoke.PlayImpl");
		play.goWhere("beijing");
		Assert.assertTrue(play != null);
	}
}
