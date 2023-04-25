package Day04.ex03_Car;

public class CarEx {
	public static void main(String[] args) {
		//객체생성
		Car car =new Car();
		car.model ="제네시스";
		//car.speed=200;
		//private으로 지정한변수는 외부 에서 접근 불가 
		car.setSpeed(200);
		System.out.println("model:" +car.getModel());
		System.out.println("speed:" +car.getSpeed());
		
		car.setSpeed(-100); //car speed >0
		System.out.println("speed:" +car.getSpeed());
		
		car.setSpeed(500); //car speed >500-->300
		System.out.println("speed:" +car.getSpeed());
		
		car.setSpeed(80); //car speed >0
		System.out.println("speed:" +car.getSpeed());]
				
	}
}
