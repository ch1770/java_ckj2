package DAY01;

public class ex09_byte {
	public static void main(String[] args) {
		//1 byte=8bits
		//bit:0,1
		//1바이트는 2^8=256개의 데이터 를 표시 
		//양수와 음수롤 표현하면 -128에서 ~127개까지 표현 가능 
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 =127;
		//200의 경우 1바이트 범위를 벗어남 (오퍼플로우)
		System.out.println("var1:" +var1);
		System.out.println("var2:" +var2);
		System.out.println("var3:" +var3);
		System.out.println("var4:" +var4);
		System.out.println("var5:" +var5);
		
		sc.close();
	}
}

