package com.javaex.diysummary;

public class Loop {

	public static void main(String[] args) {
		
		/*
		  while(조건식){
		  	조건식이 true일 때 실행되는 영
		  }
		  조건식이 false이면 내부 구문을 받지 않고 외부 조건을 해석하여 연산함
		  
		  for(초기화; 조건식; 증감식)
		  for문을 앞으로 많이 쓰게 될 것임 (특히 명확한 지정범위 등을 가지고 있을 경우)
		  
		  while문은 조건 범위 혹은 횟수 등이 예측이 불가능하거나 어려울 때 사용함
		  
		  break; continue;로 반복문 제어 가능
		  break는 반복문을 멈추며
		  continue는 조건이 true일 때 받지만 그 아래에 작성된 내용을 무시하고 반복을 이어나감
		  
		  do-while은 while문에 진입하여 질문을 던지기 이전에 반드시 실행될 요소가 있을 때 사용
		  
		  ex)
		  	System.out.println("숫자를 입력하세요. [0이면 종료]");
			int sum = 0;
			int num;
		
			do {
				num = sc.nextInt();
				sum = sum+num;
				System.out.println("합계: " + sum);
			}while(num!=0);
			System.out.println("종료");
		  
		  ===========================================
		  
		  while(true) {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계 " + sum);
			if(num==0) {
				break;
			}
		}
		System.out.println("종료");
		  
		  위 아래 모두 같은 코드임
		  
		  문법이 뒤집혀져 있어 진입장벽이 느껴지는 코드
		  
		  */
		
		
		
		
		
	}

}
