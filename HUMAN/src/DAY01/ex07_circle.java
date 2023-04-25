package DAY01;

import java.util.Scanner;

public class ex07_circle {
	public static void main(String[] args) {
		//상수
		//키워드 final
		final couble PI = 3.141592;
		PI = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름:");	
		double radius = sc.nextDouble();
		double area = PI*radius*radius;// radius 반지름 
		
		System.out.println("원의 넓이 :" +area);
		sc.close 		
	}
}
