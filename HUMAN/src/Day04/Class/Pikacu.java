package Day04.Class;

public class Pikacu {
//클래스:객체를 정의하는 설계도
	// 멤버 :변수 메소드
	
	//변수
	public int energy;
	public String type;
	pubic int level;
	
	
	
	//메소드 
	//접근지정자 반환타입 메소드명 (매개변소){}
	public String aAttack() {
		return "십만볼트";
	}
	public String bAttack() {
		return "볼트체인지";
	}
	public String cAttack() {
		if (level>=40)
		   return "아이언테일";
		else 
		   return "사용불가";
	}
}
