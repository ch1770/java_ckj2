package day02;

import java.util.Scanner;

public class ex11_Grade {
	public static void main(String[] args) {
		//학점을 입력받아 점수대를 입력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("학점:");
		//sc.next()  ==> string
		//toUpperCase()  ==> 대문자로 변환
		//charAt(0) ==>문자열에서 해당 index(순서번호)의 문자를 추출
		//입력 :  abc
		
		//입력받은 문자열을 대문자로 변환하고 첫번째(0) 문자를 가져오낟. 
		char (grade) =sc.next().toUpperCase().chart(0);
		
		switch(grade) {
			case 'A':
				System.out.println("90점~100점입니다");
			    break;
			case 'B':				
				System.out.println("80점~89점입니다");
			    break;
			case 'C':
				System.out.println("70점~79점입니다");
			    break;
			case 'D':
				System.out.println("60점~69점입니다");
			    break;
			case 'F':
				System.out.println("60점미만입니다");
			    break;  
			default:
				System.out.println("A~f사이의문자를입력해주세요");
			    break;
		   
			    
			    
		}
		sc.close();
	}
}
