package com.javaex.practice08_Ex05;

public abstract class Calc {
	
	// 필드
	protected int a;
	protected int b;
	
	// 생성자
	public Calc() {}
	
	public Calc(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	// 메소드 일반
	
	public void setValue() {}

	public int calculate() {
		return 0;
	}

	
	
}
