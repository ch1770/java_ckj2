package Ex07.Ex02_encapsulation;

import java.security.spec.ECFieldF2m;

public class Bank {
	public static void main(String[] args) {
		Encapsulation ec =new Encapsulation(0,"국민은행","282401-04-109955","한성호");
		//
		ec.setDeposite(1000000);
		
		int money =ec.getDeposit();
	    System.out.println(ec);
	    System.out.println("계좌잔액:"+money);
	}
}
