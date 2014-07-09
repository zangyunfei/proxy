package com.zyf.proxy.aspectJ;

import org.springframework.stereotype.Service;

@Service
public class Demo {
	public void process(String name, String id) {
		System.out.println("process ing ...");
	}
}
