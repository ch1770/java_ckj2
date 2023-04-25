package Day07.Ex06_updownCasting;

public class UpCasting {
	public static void main(String[] args) {
		//업캐스팅 (자동타입변환)
		//(부모클래스)=(자식클라스)
		Person person =new Student("김휴먼",20,1,"문예창작과")
		
				
		//Person:name,age
		//Student :name,age,grade,major
		System.out.println("name:"+person.name);
		System.out.println("age:" +person.age);
		
		//Person 객체에서는 grade ,major 번수를 접근할수 없다
		
		//System.out.println("grade:" +person.grade);
		//System.out.println("major:"+person.major);
		
		
		
		
		//클래스를 업캐스팅하면
		//변수는 부모클래스에 있는 변수만 접근가능하고
		//메소드는 자식 클래스의 메소드가 우선하여 실행된다 
		
		
		//바인딩 (Binding)
		//:프로그램에서 사용되는 요서에 실제 값을 결정짓는 행위
		//-정적바인딩
		// 해당요소의 실제 값을 컴파일할때결정 /변수
		//동적 바인딩은 프로그램 실행시간에 그 값을 결정한다 -메소드 오버라이딩 등 
		
		
		
		System.out.println(person.work());
		System.out.println(person);
	}
}
