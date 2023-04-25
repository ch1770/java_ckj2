package day02;

public class ex04_bitOperator {
	public static void main(String[] args) {
		// and
		//20(10진수) --> 0001 0100 (이진수)
		//16(10진수) --> 0001 0000 (이진수)
		//이진수 :0 또는 1로 표현한 수 
		
		int result =20 & 16; //and 
		System.out.println(result);
		//Integer.toBinaryString():십진수 숫자를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-----------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		
		int result2 =20 | 16;  //or
		System.out.println(result2);
		//Integer.toBinaryString():십진수 숫자를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-----------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		int result3 =20 ^ 16;	//XOR	
		System.out.println(result3);
		//Integer.toBinaryString():십진수 숫자를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-----------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		int result4 = ~20;   //NOT
		System.out.println(result4);
		//Integer.toBinaryString():십진수 숫자를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-----------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		//최상위비트 (MSB)
		//부호(+/-)가 있는 수의 경우는 최상위 비트를 부호비트로 사용한다. 
		//2의 보수연산 (양수 <--> 음수 )
		//1의 보수연산 : 0-->1  ,1-->0
		
		
		//시스트연산 
		//산술 시스트 (<<,>>)
		//부호 비트를 유지하면서 왼쪽 오른쪽으로 비트를 이동시키는 연산자
		//논리시스프 (<<<,>>>) 
		//; 부호비트를 포함하여 전체를 왼쪽 오른쪼긍로 비트를 이동시키는 연산자
		//0000 0010   ->2:2^1
		//0000 0100   ->4:2^2
		//0000 1000   ->8:2^3
		System.out.println("<<연산하면 2배식증가");
		System.out.println(16<<1);  //왼쪽으로 비트를 1칸 이동
		System.out.println(16<<2);   //왼쪽으로 비트를 2칸이동
	    System.out.println();
		
		
		
		System.out.println(">>연산하면 1/2배식감소");
		System.out.println(16>>1);  //오른쪽으로 비트를 1칸 이동
		System.out.println(16>>2);   //오른쪽으로 비트를 2칸이동
		System.out.println();
		
		System.out.println("부호가 있는경우");
		System.out.println(-2<<1);  //오른쪽으로 비트를 1칸 이동
		System.out.println(-2<<2);   //오른쪽으로 비트를 2칸이동
		System.out.println();
		
		
		System.out.println(2>>1);
		System.out.println(-2>>>31);  //오른쪽으로 비트를 1칸 이동
		System.out.println(Integer.toBinaryString(2));   //오른쪽으로 비트를 2칸이동
		System.out.println(Integer.toBinaryString(-2));
		
		
		
		
	
		
	}
}
