package Day07.Ex01_ObjectArray;

import java.util.Scanner;

public class BookArray {
	public static void main(String[] args) {
		//Book타입의 객체 배열 선언 및 생성
		Book[] bookarray =new Book[3];
		Scanner sc =new Scanner(System.in);
				//사용자입력 
		
		for (int i = 0; i < bookarray.length; i++) {
			System.out.print("제목:");
			String title =sc.nextLine();
			
			System.out.print("저자:");
			String author=sc.nextLione();
			
			//Book객체를 생성하여 bookArray 배열요소에 대입
			bookArray[i]=new Book(title,author);  //객체배열 
		}
		//출력
		for (Book book : bookarray) {
			System.out.println(book);
		}
				
		
		sc.close();
	}
}
	
	/*책제목,저자명을 갖는 Book이라는 클래스를 정의하고
	 * Book클래스 타입의 객체배열을 생성하여
	 * 사용자료부터 책 3권을 입력받아 출력하는 프로그램을 작성하시오
	 * 
	 */
	class Book{
		String title,author;
		public Book() {
			this("제목없음","작자미상");
		}
		public Book(String title,String author) {
			this.title=title;
			this.author=author;
		}
		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + "]";
		}
		
	}
}
