package com.zyf.proxy.aspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class RoundAspect {

	/**
	 * JoinPoint 参数就代表了织入增强处理的连接点。JoinPoint 里包含了如下几个常用方法。
	 * 
	 * Object[] getArgs(): 返回执行目标方法时的参数。
	 * 
	 * Signature getSignature(): 返回被增强的方法的相关信息。
	 * 
	 * Object getTarget(): 返回被织入增强处理的目标对象。
	 * 
	 * Object getThis(): 返回 AOP 框架为目标对象生成的代理对象
	 * 
	 * @param jp
	 * 
	 * 
	 * @return
	 * @throws java.lang.Throwable
	 */
	@Around("execution(* com.zyf.proxy.aspectJ.*.*(..))")
	public Object processTx(ProceedingJoinPoint jp) throws java.lang.Throwable {
		System.out.println("执行目标方法之前，模拟开始事物...");
		// 执行目标方法，并保存目标方法执行后的返回值
		Object rvt = jp.proceed();
		System.out.println("执行目标方法之前，模拟结束事物...");
		return rvt + "新增的内容";
	}
}
