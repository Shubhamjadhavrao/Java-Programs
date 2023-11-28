package Polymorphism;

public class Testpayment{
	public static void main(String[] args) {
		CashPayment C = new CashPayment();
		C.pay();
		
		payment P = new CashPayment();
		P.pay();
		
//		P = new CreditCard();
		CreditCard C1 = new CreditCard();
		C1.pay();
	}
	
}
