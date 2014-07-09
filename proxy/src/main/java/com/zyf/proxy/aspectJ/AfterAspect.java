package com.zyf.proxy.aspectJ;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
public class AfterAspect {
	// 匹配 com.wicresoft.app.service.impl 包下所有类的所有方法作为切入点
	@After("execution(* com.zyf.proxy.aspectJ.*.process(..))")
	public void release() {
		System.out.println("模拟方法结束后的释放资源...");
	}
}
