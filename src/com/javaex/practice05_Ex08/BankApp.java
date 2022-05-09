package com.javaex.practice05_Ex08;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		
		System.out.println("312-89562-123456 계좌가 개설되었습니다.");

		while(true) {
			System.out.println("------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
			
			System.out.print("선택>");
			int choice = sc.nextInt();
			
			
			if(choice == 4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				switch(choice) {
				case 1:
					System.out.print("예금액>");
					int deposit = sc.nextInt();
					balance += deposit;
					break;
				
				case 2:
					System.out.print("출금액>");
					int withdraw = sc.nextInt();
					balance -= withdraw;
					break;
				
				case 3:
					System.out.println("잔고액>" + balance);
					break;
					
				default:
					System.out.println("다시입력해주세요");
					break;
				}
			}
		}
		
		sc.close();
	}

}
