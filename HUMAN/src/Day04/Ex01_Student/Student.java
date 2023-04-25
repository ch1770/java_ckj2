package Day04.Ex01_Student;

public class Student {
      //학생의 속성 : 이름 , 나이 ,학번 ,전공
	  //변수
	String name;
	int age ;
	String stdNo;
	String major;
	
	
	//생성자
	//기본 생성자
	//모든 매개변수를 포함 하는 생성자
	public Student() {
		this("이름없음", 1, "00000000","없음");
	}
	//모든 매개 변수를 포함 하는 생성자
	public Student (String name, int age, String stsNo,String major) {
		this.name =name;
		this.age=age;
		this.stdNo=stdNo;
		this.major = major;
	
	//메소드 공부하기
	public void study(String subject) {
		System.out.println(subject+"(을/를) 공부합니다.,");
		//반환타입이 void면 return 생략
	}
	//평균성적 구하기
	public double getAverage(int score1, int score2) {
		//평균 = 합계/개수
		double average =0.0;
		average =(double)(score1 +score2)/2;
		return average;
		
		//메소드 오버로딩
	public double getAverage(int score1, int score2, int score3) {
	    double average =0.0;
	    average=(double)(score1+score2+score3)/3;
	    return average;
		}
	
	//매개변수를 배열 [] 로 받아옴 
	public double getAverage(int[] scores) {
	    double average =0.0;
	    int sum=0;
	    //평균을 구하기 
	    //1.합계를 구한다 
	    for (int i = 0; i < scores.length; i++) {
			sum=sum+scores[i];  //sum=400 
		}
	    //2.평균을 구한다. 
	    average =(double)sum/scores.lenth;
	    return average;
	}
	
	//foreach문을 이용한 합계 
	for(int score:scores) {
		//합계
		sum +=score;
	}
	    //평균
	average =(double) sum/scores.length;
	
	return average;
	}
	}
	
	
}
