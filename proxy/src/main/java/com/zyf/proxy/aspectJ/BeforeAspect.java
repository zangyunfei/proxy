package com.zyf.proxy.aspectJ;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspect {

	private static final Logger log = Logger.getLogger(BeforeAspect.class);

	@Before("execution(* com.zyf.proxy.aspectJ.*.*(..))")
	public void before(JoinPoint jp) {

		Signature signature = jp.getSignature();
		System.out.println("Name:" + signature.getDeclaringTypeName());
		System.out.println("method:" + signature.getName());
		for (int i = 0; i < jp.getArgs().length; i++) {
			Object arg = jp.getArgs()[i];
			if (null != arg) {
				log.info("Args:" + arg.toString());
			}
		}
	}
}