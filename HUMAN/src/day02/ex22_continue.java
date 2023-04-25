package day02;

import java.util.Scanner;

public class ex22_continue {

	public static void main(String[] args) {
		//5개의정수를 입력 받아
		//입력받은 수중 야8ㅇ수만 합계를 구하여 출력하시오
		
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int n =sc.nextInt();
			
			//음수일때만 합게에 누적하지 않고 넘어가려면?
			if (n<0)
				continue;
			//남은 실행문을 무시하고 다음 반복을 점프하는 명령어
			 sum +=n;
		}
           System.out.println("양수의합:" +sum);
           sc.close();
	}

}
