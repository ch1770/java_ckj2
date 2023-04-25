package day02;

import java.util.Scanner;

public class ex18_Gugu {
	public static void main(String[] args) {
		//구구단(1~9단)
		//우나하는 단은 입력받아 아래왕 같이 구두단 수식을 출력하시오
		//입력 :3
		//출력 
		//3*1=3
		//3*2~~~
		//3*9=27
		Scanner sc =new Scanner(System.in);
		System.out.print("입력:");
		int input =sc.nextInt();
		
		//9회변수입력 반복 구구단 
		//입력단 x (1~9)_= 결과 
		 for (int i = 1; i <=9; i++) {
			int result =input*i; //3*(1~9)반복 i++  1,2,3 
			System.out.println(input +  "*"+"="+result);
			
		}
		 sc.close();
		 
	}
}
//위랑인은 특정단만 출력
//입력 없이 1단부터 9단까지 출력 for문에서 9번 반복을 다시 내부 시퀀스로 9번반복하면 된다,

