package day02;

public class ex23_break {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//무한루프 
		//반다시 종료조건을 추가해주어야 한다 (break)
		while(true) {
			System.out.print("입력:");
			String str=sc.nextLine();
			
			//문자열.EQUALS("비교문자열")
			//문자열이 비교문자열과 일치하는지 여부를 알려주는 메소드
			
			if (str.equals("STOP"))
			    break;
			
			System.out.println(">>"+str);
	
		}
		System.out.println("프로그램을 종료합니다...");
		sc.close();
	}

}
