package DAY01;

import java.util.Scanner;

/**
 *자바기존입출력
 *@author h
 */

 public  class ex02_scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//(경고)-노란색 밑줄로 표시
	System.out.print("a : ");
	int a =sc.nextInt();
	//"문자열"은 큰따옴표로 
	//문자열과 숫자연결하기
	//:"문자열"+변수 (숫자)
	//문자열과 숫자를 +(문자열연결연산자)로 연결할수 잇다
	//이때 숫자 (int)자료형이 문자열 자료형으로 연결된다 
	//"a:"+10"--> "a:10"
	System.out.println("a:"+a);
	sc.close();
	
	
	
	//nextInt(); 정수하나를 입력받는 메소드 
	}
}
