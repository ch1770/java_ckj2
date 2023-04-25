package day02;

public class ex19_dualGugu {

	public static void main(String[] args) {
		//구구단 for문의 2중반복으로 입력없이  1~9단까지 자동 출력기능 
		//개별 단별 9번 반복
		//1~9단까지 반복
		//AxB
		for (int i = 1; i <=9 ; i++) {
			//j:곱(B)
			for (int j = 0; j <=9; j++) {
				System.out.println(i+"*" +j +"="+i*j);
				System.out.print("\t"); //탭 공백 출력
			}
			//1*1=1 1*2=2 ~1*9=9
		System.out.println();//한단끝 다음줄로 출력 
		}
   
	}

}
