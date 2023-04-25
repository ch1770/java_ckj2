package day02;

public class ex13_while {
	public static void main(String[] args) {
		//1~10까지 공백을 두고 출력하시오
		int a = 1;
		//while (조건)  {반복실행문}
		while( a<=10) {
			System.out.println(a++);
			//a++;   a=a+1; a가 1~10까지는 조건만족  11부터는 반복안함
		}
	}
}
