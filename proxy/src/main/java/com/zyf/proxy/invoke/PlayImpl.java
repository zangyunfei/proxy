package com.zyf.proxy.invoke;

public class PlayImpl implements Play {
	private String plz;

	public void goWhere(String name) {
		plz = name;
		System.out.println(" play start ,go to " + plz);

	}

	public void comeBack() {
		System.out.println("come back from " + plz);
	}

}
