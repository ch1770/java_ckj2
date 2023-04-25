package Day04.ex03_Car;

public class Car {
	//car 클래스 변수 ( 멤버변수 , field)
	String model;
	private int speed;  //외부에서 접근 금지 "private"
	//생성자 형성
	public Car() {
		
	}
	public Car(String model) {
		
		this.model = model;
	}
	public Car(String model, int speed) {
		
		this.model = model;
		this.speed = speed;
	}
	//getter 변수의 값을 가져오는 메소드
	//setter 변수의 값을 지정하는 메소드
	//게터 /세터 이름 : getNamw(), setName()
	// get /set 뒤에 변수명을 첫글잘글 대문자로 해서 메소드명 정의 (관레)
	
	public String getModel() {
		return model;
	}
	public void setModel(string model) {
		this.model=model;
	}
	pubic int getSpeed() {
		return speed;
	}
	public void 
}
