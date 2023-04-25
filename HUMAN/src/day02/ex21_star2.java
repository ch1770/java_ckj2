package day02;

import java.util.Scanner;

public class ex21_star2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("N;");
		int N=sc.nextInt();
		
		for (int i = 1; i <=N; i++) {
			//앞문제와 달리 역삼각형 *출력 
			for (int j = 1; j >=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
				sc.close();
	}
}
