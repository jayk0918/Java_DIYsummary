package com.javaex.practice08_Ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		// practice08. ex08
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요");
		
		List<Friend> friends = new ArrayList<Friend>();
		
		for(int i=0; i<3; i++) {
			String input = sc.nextLine();
			String[]info = input.split(" ");
			
			String name = info[0];
			String hp = info[1];
			String school = info[2];
			
			Friend friendList = new Friend(name, hp, school);
			
			friends.add(friendList);
		}
		
		for(Friend f : friends) {
			f.showInfo();
		}
		
		
		sc.close();
		
		
	}
	
	
}
