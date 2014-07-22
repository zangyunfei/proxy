package com.zyf.proxy.annotation;

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
		Object o = null;
		try {
			Class clazz = obj.getClass();
			if (clazz.isAnnotationPresent(Description.class)) {
				Description desc = (Description) clazz
						.getAnnotation(Description.class);
				System.out.println("desc.author:" + desc.author());
				System.out.println("desc.size:" + desc.size());
			} else {
				System.out.println("没有在subDescriptionTest上使用注解!");
			}
			o = method.invoke(srcTarget, args);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return o;
	}

}
