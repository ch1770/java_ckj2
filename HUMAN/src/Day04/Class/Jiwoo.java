package Day04.Class;

public class Jiwoo {
     public static void main(String[] args) {
		//객체생성
    	//클래스 타입 객체몀 = new 클래스명 ();
    	 Pikachu pikachu = new Pikachu();
    	 //(.)접근연산자 :객체 변수 메소드에 접근하는 연산자 
    	 //pikachu.energy
    	 //pikachu.type
    	 //기본 생성자 
    	 
    	 public Pikachu())_{
    		 this (100,"전기");//14번 라인과 22번 라인은 메소드 중복정의증 메소드 오버로딩
    		// enery=100;
    		 //type="전기"
    	 }
    	 //생성자 자동완성
    	 //알트 쉬프트 에스 ==>o
    	 
    	 //기본 생성자 
    	 public Pikachu(int energy,Sring type) {
    		
    			 this.energy =energy;
    			 this.energy =type;
    	
    	 
    	 public String aAttack() {
    		 return  "십만볼드";
    	 public String bAttack() {
    		 return "전광석화"
    	 }
    	 }
    	 
    	 System.out.println("#######피카츄#####");
    	 System.out.println("에너지 :" + pikachu.energy);
    	 System.out.println("타입:" +pikachu.type);
    	 System.out.println("공격A:" +pikachu.aAttack());
    	 System.out.println("공격B:" +pikachu.bAttack());
    	 System.out.println("공격C:" +pikachu.cAttack());
    	 System.out.println();
    	 
    	 Pikachu pikachu20 = new Pikacu(150,"진화");
    	 
    	 System.out.println("#######피카츄(Lv.20)#####");
    	 System.out.println("에너지 :" + pikachu20.energy);
    	 System.out.println("타입:" +pikachu20.type);
    	 System.out.println("공격A:" +pikachu20.aAttack());
    	 System.out.println("공격B:" +pikachu20.bAttack());
    	   	 
    	 System.out.println();
    	 
    	 Raichu raichu = new Raichu();
    	 System.out.println("#######라이츄#####");
    	 System.out.println("에너지 :" + raichu.energy);
    	 System.out.println("타입:" +raichu.type);
    	 System.out.println("공격A:" +raichu.aAttack());
    	 System.out.println("공격B:" +raichu.bAttack());
    	 System.out.println();
    	 
    	 Raichu raichu40 = new Raichu(400,"메가전기");
    	 System.out.println("#######라이츄(Lv.40)#####");
    	 System.out.println("에너지 :" + raichu40.energy);
    	 System.out.println("타입:" +raichu40.type);
    	 System.out.println("공격A:" +raichu40.aAttack());
    	 System.out.println("공격B:" +raichu40.bAttack());
    	 System.out.println("공격C:" +pikachu40.cAttack());  
    	 System.out.println();
	}
}
