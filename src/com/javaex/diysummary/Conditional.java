package com.javaex.diysummary;

public class Conditional {

	public static void main(String[] args) {
		/* if 조건문 
		if(조건식){
		}
		형식으로 작성
		
		if - else 기본 구조에서 else if로 추가조건 부여 가능
		switch-case 구조로도 작성 가능하나 조건부 구문임 (모든 조건이 ==, 즉 같은 값임을 비교할 때)
		if-else <-> switch-case로 형태변환 작성 가능(위 조건에 맞고 같은 내용이라면)
		
		switch(변수){
		
		case (값1):
		(값1)자리에 int(숫자) / String(문자열) 사용 가능
		break;(여기서 break를 부여하지 않으면 해당값을 출력하고 break가 걸릴때까지 출력함)
		...
		default(위에서 정의한 case 내용이 없을 때 실행할 내용)
		이때까지의 사용경과를 돌이켜보면 쓰지 않아도 문법적 오류는 발생하지 않았음
		}
		
		단, break없는 switch-case문은 권장하지 않음
		ex)	switch (month) { 
			case 4:
			case 6:
			case 9:
			case 11:
			days = 30;
			break;
			
			case 2:
			days = 28;
			
			default:
			days = 31;
			}
		
			위 코드는 달이 각각 30, 31, 28일일 때를 구분하여 정의한 것
			그 코드 자체의 문제라기보다 향후 수정 시 독해가 어려울 위험이 있음
			노가다성이라도 case별로 결과값을 부여하는 것을 권장함
		
		*/
		
	}

}
