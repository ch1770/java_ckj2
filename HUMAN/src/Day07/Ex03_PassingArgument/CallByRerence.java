package Day07.Ex03_PassingArgument;

public class CallByRerence {
	public static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			//10 20 30 40 50
			arr[i] =(I+1)*10;
		}
		System.out.println("*******setArr 메소드******");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
			
	}
		System.out.println();
}
    public static void setobj(Pikachu pikachu) {
    	pikachu.energy =1000;
    	pikachu.type ="불";
    	System.out.println();
    	System.out.println();
    	
    }
		
	}