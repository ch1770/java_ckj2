package day03;

import java.util.Iterator;
import java.util.Scanner;

public class ex07_Zigzag {

	public static void main(String[] args) {
		//배열 크기  n을 입력받아
		// nxn구조의 배열에 1부터 시작하여 1씩 증가하는 값을 대입하는데
		//아래와 같은 구조로 값을 대입하고 출력하시오
		//입력예시
		//4
		//출력예시>
		//1 2 3 4
		//8 7 6 5
		//9 10 11 12
		//16 15 14 13
		
		//1.n을 입력 받는다
		
	    Scanner sc = new Scanner(System.in);
	    int N=sc.nextInt();
	    
	    //NxN구조로 배열을 생성한다
	    int arr[][] = new int[N][N];
	    	
	    		//1행 ~ 열 : 1~4 , +1씩 증가: 
	    		//index기준 0~3
	    		//2행 ~ 열 : 4~1 ,-1씩 감소
	    		//...
	    int sw =1;
	    int k =1;
	    
	    for (int i=0; i<N; i++) {
	    	//인쪽 반복문 :j~ 열 
	    	// i-->0 j-->0 : i -->0==>j 0 1 2 3
	    	//i-->1 :j
	    	//정방향
	    	if (sw==1) {
	    	for (int j=0; j<N; j +=sw) {
	    		arr[i][j] =k++;
	    	}
	    	}
	    	//역방향
	    	else if  (sw==-1) {
	    		for (int j = N-1; j >=0; j +=sw) {
			
				
	    		arr[i][j] =k++;
	    	}
	    }
	    	//방향전환
	    	sw=sw*(-1);
	    }
	    sc.close();
	    
	}

}
