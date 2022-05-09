package com.javaex.practice08_Ex04;

import java.util.Scanner;

public class intCalculator {

	public static void main(String[] args) {
		
		// practice08 ex04
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		
		String numbers = sc.nextLine();
		String[] intConvert = numbers.split(" ");
		
		for(int i=0; i<intConvert.length; i++) {
			int result = Integer.parseInt(intConvert[i]);
			sum += result;
		}
		
		System.out.println("합:" + sum);
		
		
		sc.close();
		
	}

}
