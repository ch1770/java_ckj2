package Day04.Class;


//상속  :클래스는 상속 되나 생성자는 상속이 되지 않음 

//키워드 :자식 클래스 extends 부모클래스 {}
// suoer : 생성자 상속  (소스 generate from super class)d
public class Raichu extends Pikachu {          
	//extends 상속 
	pubic Raichu() {
		super(200,"슈퍼전기");
		System.out.println();
	}
	
	
}
