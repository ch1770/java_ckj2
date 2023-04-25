package Day07.Ex05_StaticMember;

public class SingleTon {
/*
 * 싱글톤 패턴
 * -디자인 패턴중 하나로  프로그램이 시작될때 최조로 한번만 메모리를 할당해서 인스턴스를 사용하는 패턴
 * -객체가 필요할때 새로운 객체를 생성하지 않고 기존의 인스턴스를 활용한 코드의 패턴 
 * -객ㄱ체를 하나만 생성하기때문에 메모리를 효율적으로 사용할 수 잇다
 * 
 */
	private class SingleTon {]
			private static SingleTon instance = new SingleTon();
			//생성자를 private 로 정의 타클래스에서 싱글톤을 객체로 못쓰게 하기위해 
			private SingleTon() {
				
			}
			//인스턴스(객체) 가 생성되지 않앗다면 생성해주소
			//이미 생성되어 있다면 생성된 인스턴스를 반환한다
			public static SingletTon getInstance() {
				if (instance ==null ) {
					instance =new SingeTon();
					
				}
				retirn instance;
			}
	}
}
