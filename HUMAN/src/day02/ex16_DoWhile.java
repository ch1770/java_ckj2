`.````````````````````````````````````````````````````````````package day02;

import java.util.Scanner;

public class ex16_DoWhile {
	public static void main(String[] args) {
		
		//변수 선언 : 메뉴번호 (메뉴판 만들기), 메뉴이름
		int menuNo = 0;
		String menuName ="";
		Scanner sc = new Scanner(System.in);
		//do while ans 
		//무조건 1회는 실행후 조건을 검사하여 반복하는 문장
		do {
			System.out.println("####점심메뉴판####");
			System.out.println("1.서브웨에(에그마요)");
			System.out.println("2.신라면");
			System.out.println("3.삼양라면&주먹밥");
			System.out.println("4.라밥");
			System.out.println("5.잔치국수");
			System.out.println("6.맥도날드");
			System.out.println("7.아비꼬");
			System.out.println("8.사보텐");
			System.out.println("9.제주흑돼지 돈까스");
			System.out.println("10.페이페이(나시고랭)");			
			System.out.print("메뉴번호:");

            menuNo = sc.nextInt(); //메뉴번호입력
            
            switch (menuNo) {
            	case 1: menuName="서비웨이(에그마요)";break;
            	case 2: menuName="신라면";break;
            	case 3: menuName="삼양라면&주먹밥";break;
            	case 4: menuName="라밥";break;
            	case 5: menuName="잔치국수서비웨이(에그마요)";break;
            	case 6: menuName="맥도날드서비웨이(에그마요)";break;
            	case 7: menuName="서비웨이(에그마요)";break;
            	case 8: menuName="서비웨이(에그마요)";break;
            	case 9: menuName="서비웨이(에그마요)";break;
            	case 10: menuName="서비웨이(에그마요)";break;
            	default: menuName="(굶음)";break;           	
            	
            }
            //메뉴번호가 0이 아나면
            if (menuNo>=1 && munuNo<=10) {
             System.out.println(menuName + "(을/를) 먹엇습니다")
            }else if (menu !=0) {
            	System.out.println(menuName);
            }
		} while (menuNo !=0);//반복조건 true되면 무한루프임
		//반드시 반복문안에 종료조건을 넣어주어야 한다,
		System.out.println("메뉴판을 종료합니다");
		sc.close();
	}
}
