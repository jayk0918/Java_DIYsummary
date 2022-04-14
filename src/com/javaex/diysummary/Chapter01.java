package com.javaex.diysummary;

public class Chapter01 {
	public static void main(String[] args) {
		
		//building logics
		//문법이 중요한게 아니라 로직 체계를 갖추는 것
		
		//plan 1 _ 변수선언과 값 부여를 독립적으로
		int cost1;		//int(자료형_정수형) cost1(변수이름); -> 선언 과정
		cost1 = 1000;	//cost1 = 1000; -> 초기화 과정/cost1이라는 변수에 1000이라는 값 부여
		int cost2;
		cost2 = 5000;
		
		System.out.println(cost1); //출력명령
		System.out.println(cost2);
		
		cost1 = 4000;
		// 앞서 선언한 cost1 = 1000의 값을 overwrite, 그러나 출력명령이 없어 확인은 별도 진행해야 함
		
		
		//plan 2 _ 변수선언과 값 부여를 동시에
		int cost3 = 1000; // cost3에 1000이라는 int값이 변화가 없을거라면 한번에 진행 가능
		int cost4 = 5000;
		
		System.out.println(cost3);
		System.out.println(cost4); //노란 경고줄 꼴보기 싫으니 그냥 입력함
		
		
		/*8가지 기본자료형(type)
		boolean(논리형), char(character, 문자형, 1글자만 지원) + ''(반드시 작은따옴표)
		byte, short, int(main), long+L(정수형)
		float+F, double(main) (실수형_소숫점)
		
		-> 정수형 : 숫자 크기 issue / 각각의 자료형에서 지원하는 절대값 범위가 지정되어 있음
		-> 실수형 : 정확도 issue /
				무한정한 숫자이기에 float / double이 각각 지원하는 범위 내에서 표현하고 나머지는 버
		+
		String(기본 자료형 X, char보다 훨씬 자주쓰임, 반드시 대문자 S사용) + ""(반드시 큰 따옴표)
		*/
		
		//기본 자료형은 method없이 값을 가짐, 주소라는 개념이 없음
		//위 8가지 기본자료형을 제외하면 전부 주소값 놀이
		
		char ch01 = 'a';
		char ch02 = 77;
		char ch03 = '7';
		System.out.println(ch01);
		System.out.println(ch02);
		System.out.println(ch03);
		
		// char issue
		// char에서 ''내부에 1개 글자를 집어넣을수도 있지만
		// 그냥 숫자를 입력하면 char가 지원하는 해석표에서 숫자에 맞는 문자를 찾아 출력함
		// char로 1자리 숫자를 굳이-구태여 문자로 표현하고 싶으면 '7' 이런식으로 작성
		
		// 연습문제 review - 자료형 판단하기 (개발자의 주요업무)
		
		/*
		(String) number;		학번	
		(String) name;			이름
		(boolean) isEnrolled;	등록 여부
		(float/double)grade;	평점
		(String) address;		주소
		(String) major;			전공
		(int) unit;				이수 학점
		(boolean) haveMinor;	부전공 여부
		(String) juminNo;		주민번호(-없이 13자리숫자) 
		(String) cellphone;		핸드폰 번호(-포함한 숫자)
		(int) age;				나이
		(String) email;			이메일주소
		*/
		
	}
}
