package com.zyf.proxy.jdkproxy;

public class ProxyEasyDemo1 implements Play {
	private Play p;

	ProxyEasyDemo1(Play play) {
		p = play;
	}

	public void goWhere(String name) {
		System.out.println(" read go to play");
		p.goWhere(name);
	}

	public void comeBack() {
		System.out.println("  买回家的车票 ");
		p.comeBack();
	}

	public static void main(String[] args) {
		Play p = new ProxyEasyDemo1(new PlayImpl());
		p.goWhere("beijing");
		p.comeBack();
	}
}
