package com.javaex.practice08_Ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String info = sc.nextLine();
			
			if(info.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}else {
				String[] calInfos = info.split(" ");
				
				int num1 = Integer.parseInt(calInfos[0]);
				int num2 = Integer.parseInt(calInfos[2]);
				String symbol = calInfos[1];
				
				switch(symbol) {
				
				case "+":
					Calc plus = new Add(num1, num2);
					System.out.println(">> " + plus.calculate());
					break;
					
				case "-":
					Calc minus = new Sub(num1, num2);
					System.out.println(">> " + minus.calculate());
					break;
					
				case "*":
					Calc multiply = new Mul(num1, num2);
					System.out.println(">> " + multiply.calculate());
					break;
				
				case "/":
					Calc divide = new Div(num1, num2);
					System.out.println(">> " + divide.calculate());
					break;
				
				default:
					System.out.println("알 수 없는 연산입니다.");
					break;
				}
			}
		}
		
		sc.close();
		
	}

}
