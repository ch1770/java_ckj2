package DAY01;

import java.util.Scanner;

public class ex14_Intro {
	
	public static void main(String[] args) {
		System.out.println("이름,나이,키,주소를 공백을 두고 입력해보세요");
		
		Scanner sc =new Scanner(System.in);
		
		//string :문자열을 표현하는 참조 자료형
		//string 변수 :"문자열";
		String name =sc.next();//문자열입력 
		System.out.println("이름"+name);
		
		int age =sc.nextInt();
		System.out.println("나이:"+age);//정수하나입력 
		
		double height =sc.nextDouble();//실수하나 입력
		System.out.println("키:" +height);
		
		String address =sc.nextLine();//띄어쓰기잇는 문자열도입력 가능 
		System.out.println("주소:" +address);
		
		sc.close();
	}
}
