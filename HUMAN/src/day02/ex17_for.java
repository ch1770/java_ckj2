package day02;

public class ex17_for {
	public static void main(String[] args) {
		
		//for(1.초기식 ; 2조건식; 4증감식) {3.실행문}
		//실행순서 : 1-->반복(2-->3-->4)
		//1부터 10까지의 정수를 출력하시오
		for (int i = 0; i <= 10 ; i++) {
			System.out.println(i+"");
		}
		System.out.println();
		
		//2.50~100까지의 정수를 출력하시오
		
		//3.1~20까지의 정수중 짝수만 출력하시오
		
		//4.1~20까지의 정수중 홀수만 출력하시오
	   for (int i = 50; i <=100; i++) {
		  System.out.print(i+"");
	}
	   System.out.println();
	   
	   //20 까지 중 짝수만 출력
	   for (int i = 2; i < =20; i=i+2) {
		   System.out.print(i+"");
		
	}
	   System.out.println();
	   
	   //4.1~20중 홀수만 출력하시오
	   for (int i = 1; i <=20; i+=2) {
		System.out.print(i+"");
	}
	   System.out.println();
	}
}
