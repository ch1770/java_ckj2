package day03;

import java.util.Scanner;

public class EX02_MAXMIN {

	public static void main(String[] args) {
		//첫째줄에 입력할 개수 n을 입력받고
		//둘째줄에 N개의 정수를 공백을 두고 입력받으시오
		//N개의정수중 최댓값을 구하여 출력하시오
		//입력예시
		//5
		//90 60 70 100 55
		//출력예시
		//최대값 100
		//순서도 1.정수하나를 입력받는다
		//2입력받은 정수를 변수 n에 대입한다
		//입력받은 n개의 정수를 배열arr에 저장한다
		//두요소중 더 큰요소를 변수 max에 대입한다
		//반복이 끝나고 max를 출력한다
        Scannner sc =new Scanner(System.in);
        
		int N=sc.nextInt();
		
		int arr[]= new int[N];
		
		for (int i = 0; i < N; i++) {
			//입력받은 n개의 정수를 배열 arr에 저장
			arr[i]=sc.nextInt();
		} 
		//배열 arr을 반복하여 max와 i번째 요소를 비교한다. 
		int max=arr[0]
		for (int i = 0; i < arr.length; i++) {
					//두요소중 더큰요소를 변수 max에 대입힌다.
	         if(max<arr[i])
	         
			
		
	   

	}

}
