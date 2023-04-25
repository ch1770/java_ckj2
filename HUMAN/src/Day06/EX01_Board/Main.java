package Day06.EX01_Board;
/**
 * 게시판 프로그램 
 * 메뉴판
 * 게시글 목록
 * 게시글 읽기
 * 게시글 쓰기
 * 게시글 수정
 * 게시글 삭제 
 * 
 * @author 휴먼
 *
 */
public class Main {
    
	static int max=10;  // 게시글 최대 10개 제한 
	static int Board[] boardList = new Board[max];
	static int index=0; //현재 게시글 순서번호 (0~max-1)
	static Scanner sc = new Scanner (System.in);
	
	
	//메뉴판 (기능)
	public static void menu() {
		System.out.println("#######게시판#######");
		System.out.println("1.게시판 목록");
		System.out.println("2.게시판 읽기");
		System.out.println("3.게시판쓰기");
		System.out.println("4.게시판수정");
		System.out.println("5.게시판삭제");
		System.out.println("ㅐ.프로그램종료");
		System.out.println("#####번호입력");
		
		
		
		
	}
	
	//게시글 목록
	//게시글 읽기
	//게시글 쓰기
	//게시글 수정
	//게시글 삭제
	

	
	
			
					
}
