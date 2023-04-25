package day02;

import java.util.Scanner;

public class ex06_if {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//입력받은 값을 홀 짝인지 판단 
		System.out.println("입력:");
		 int input = sc.nextInt();
		 //1%2=1
		 //2$2=0
		 //3%2=1
		 //4%2=0
		 //5%2=1
		 //6%2=0
		 //n%2=1 :홀수
		 //n%2=0 :짝수
		 
		 //홀짝 조건?
		 if (input % 2 ==1) {
			 System.out.println("홀수입니다.");
		 }
		 if ( input %2 ==0) {
			 System.out.println("짝수입니다.");
		 }
		 sc.close();
	}
}
