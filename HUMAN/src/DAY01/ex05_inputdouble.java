package DAY01;

import java.util.Scanner;

public class ex05_inputdouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				
		System.out.print("x:");
		int x = sc.nextInt();

		System.out.print("y:");
		int y = sc.nextInt();
	
		System.out.print("z:");
		int z = sc.nextInt();
		
		int sum = x+y+z;
		double avg = (double) sum/3;
		//double/int=double
		//자동형변환
		//정수형기리 연산하면 결과도 정수형
		//정수형/실수=실수
		//일반적으로 작은타입과 큰타입변수 연산하면 연산결과는 큰타입이 된다.
		

		System.out.println("합계:" +sum);
		System.out.println("평균:" +avg);
		
		sc.close();
		
	}
}
