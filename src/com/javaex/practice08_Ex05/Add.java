package com.javaex.practice08_Ex05;

public class Add extends Calc {
	
	// 필드
	private int a;
	private int b;
	
	// 생성자
	public Add() {}
	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 메소드 일반
	@Override
	public String toString() {
		return "Add [a=" + a + ", b=" + b + "]";
	}
	
	public void setValue(int a ,int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		int result = (this.a + this.b);
		return result;
	}
	
	
	
	
	
	
}
