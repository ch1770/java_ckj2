package Day07.Ex06_updownCasting;

public class DownCasting {
	public static void main(String[] args) {
		//다운캐스팅 (강제형 변환)
		//전제조건 -업케스팅
		//다운캐스팅은 업캐스팅 부모 객체를 자식 객체로 변환하는것
		//업케스팅 :(부모)<--(자식)
		//다운캐스팅 : (자식)<--(부모)
		
		
		//업캐스팅 
		Person person =new Studwnt("김휴먼",20,1,"산업디자인과");
		
		System.out.println(person);
		System.out.println(person.work());
		
		//다운캐스팅
		Student student = (Student) person;
		
		System.out.println("grade :" +stuendt.grade);
		System.out.println("major:" +student.major);
				
		
	}
	
}
