package Day05;

import java.util.Scanner;

public class Ex01_Mutiple {
	public static void main(String[] args) {
		//정수를 하나 입력 받아서
		//입력 받은 수가 3의 배수인지 아닌지 판단하고 그 여부를 출력하시오
		//3의 배수 0 :" 3의 배수입니다 "
		//3의 배수 x :"3의 배수가 아닙니다. "
		Scanner sc =new Scannner(System.in);
		System.out.print("입력:");
		int N=sc.nextInt();
		
		//조건 :3의 배수?=3,6,9,12,....
		//3%3=0
		//4%3=1 
		//5%3=2
		if (N%3==0) {
			System.out.println("3의 배수입니다.");
			
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}
		sc.close();
	}

}