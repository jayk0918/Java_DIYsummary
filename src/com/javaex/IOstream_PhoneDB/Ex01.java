package com.javaex.IOstream_PhoneDB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		List<Person> pList = new ArrayList<Person>();
		
		Reader fr = new FileReader("../../file/PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		while(true){
			String str = br.readLine();
			
			if(str==null) {
				break;
			}
			
			String[] personInfo = str.split(",");
			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];
			
			Person people = new Person(name, hp, company);
			pList.add(people);
		}
		
		Person newPerson = new Person("유재석", "010-5555-5555", "02-7552-9994");
		pList.add(newPerson);
		
		
		Writer fw = new FileWriter("../../file/PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Person newPeople : pList) {
			String saveData = newPeople.getName() + "," + newPeople.getHp() + "," + newPeople.getCompany();
			
			bw.write(saveData);
			bw.newLine();
		}
		
		bw.close();
		br.close();
		
	}

}
