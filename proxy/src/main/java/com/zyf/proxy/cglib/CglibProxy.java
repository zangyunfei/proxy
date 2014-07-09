package com.zyf.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

class CglibProxy implements MethodInterceptor {

	private Object srcTarget;

	private CglibProxy(Object o) {
		this.srcTarget = o;
	}

	@SuppressWarnings("unchecked")
	public static <T> T proxyTarget(T t) {
		Enhancer en = new Enhancer();
		en.setSuperclass(t.getClass());
		en.setCallback(new CglibProxy(t));
		T tt = (T) en.create();
		return tt;
	}

	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("拦截前...");
		Object o = method.invoke(srcTarget, args);
		System.out.println("拦截后....");
		return o;
	}

}
