package Day07.Ex03_PassingArgument;

public class CallByValue {
	public static int sum(int a,int b) {
		a=100;
		b=200;
		System.out.println("*****sum 메소드******");
		System.out.println("(a,b):"+a","+b+")");
		int sum=a+b;
		return sum;
	}
	public ststic void main(String[] args) {
		int a= 10;
		int b=20;
		System.out.println("*****sum 메소드******");
		System.out.println("(a,b):"+a","+b+")");
		
		int sum= sum(a,b);
		System.out.println("sum:"+sum);
		
		System.out.println(("*****sum 메소드호출후******");
		System.out.println("(a,b):"+a","+b+")");
	}
}
//call by refrence
//call by value

