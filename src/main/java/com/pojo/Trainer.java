package com.pojo;

public class Trainer {
	private String tname;

	public Trainer() {
		super();
	}

	public Trainer(String tname) {
		super();
		this.tname = tname;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return ( tname );
	}
	
}
