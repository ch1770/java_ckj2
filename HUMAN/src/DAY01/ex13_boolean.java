package DAY01;

import java.util.Scanner;

public class ex13_boolean {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("전원:");
		
		//boolean
		boolean on = sc.nextBoolean();
		System.out.println("on:"+on);
		
		if (on) {
			System.out.println("전원 on");
		} else {
			System.out.println("전원off");
		}
		sc.close();
		
	}
}
