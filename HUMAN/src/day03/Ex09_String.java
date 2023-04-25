package day03;

public class Ex09_String {

	public static void main(String[] args) {
		//String은 참조타입
		String a = "Hello" ;
		String b = "java" ;
		String c = "Hello" ;
		String d = new String("Hello") ;
		String e = new String("java" );
		String f = new String("java") ;
		
		System.out.println(a==c);
		System.out.println(a==d);// 객체생성을 별도로 햇으므로 각각 다른 메모리공간비교 즉 false
		System.out.println(a.equals(d));// 문자열 자체를비교하므로 true 
		
		System.out.println(e==f);
		System.out.println(e.equals(f));
		
		//== 해당 변수의 레퍼런스 메모리 영역을비교
		//equals(): 해당 변수의 문자열 자체 를 비교 
	}

}
