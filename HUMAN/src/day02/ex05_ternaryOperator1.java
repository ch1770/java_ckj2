package day02;

public class ex05_ternaryOperator1 {
	public static void main(String[] args) {
        int a=3, int b=5;
		
		//a와 b 두수의 차이를 구하시오
		//a-b=-2
		//b-a=2
		//조건연산자 (삼항 연산자)
		//(조건)?:(참일때 문장):(거짓일때 문장)
		int result =(a>b) ? a-b:b-a;
		System.out.println("두수의 차:" +result);
	}
}
