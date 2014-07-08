package com.zyf.proxy.invoke;

import org.junit.Assert;
import org.junit.Test;

public class AOPFactoryTest {
	@Test
	public void testGetAOPProxyedObject() {
		Play play = (Play) AOPFactory
				.getAOPProxyedObject("com.zyf.proxy.invoke.PlayImpl");
		play.goWhere("beijing");
		Assert.assertTrue(play != null);
	}
}
