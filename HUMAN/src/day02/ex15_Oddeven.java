package day02;

public class ex15_Oddeven {
	public static void main(String[] args) {
		//1~20까지 정수중 홀수 짝수의 합계를 각각 구하여 출력
		// 1+3+5~19=sum1
		//2+4+6+~20=sum2
		
		int a =1;
		int sum1 =0;//홀수의 합계
		int sum2 =0;//짝수의 합계
		
		// a가 20보다 작거나 같은 동안 반복
		while(a<=20) {
			//홀수
			if (a%2==1) {
				sum1 +=a;
			}
			//짝수 
			if (a%2==0) {
	            sum2 +=a;
		}
		    a++;
		}
		System.out.println("홀수의 합계:"+sum1);
		System.out.println("짝수의 합계:"+sum2);
	}
		
}
