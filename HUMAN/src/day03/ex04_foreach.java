package day03;

import java.util.Iterator;

public class ex04_foreach {

	public static void main(String[] args) {
		string []week = {"월요잉","화요일","수요일","목요일","금요일","토요일","일요일"};
		
		for (int i = 0; i < week.length; i++) { //i+=2 요일이 격일로 출력 
			System.out.print(week[i] +"");
		}
		System.out.println();
			
			//foreach문
			//배열 또는 컬렉션의 모든 요소를 순서대로 반복하는반복문 
			//  for요소타입 요소명 :배열  {}
			for (string day : week) {
				System.out.print(day+"");
			}
		
			 System.out.println();
		}

	}


