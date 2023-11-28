package Polymorphism;

interface payment {
	public void pay();

}
class CashPayment implements payment {

	@Override
	public void pay() {
		System.out.println("This is cash payment...");
		
	}
	
}
class CreditCard implements payment{

	@Override
	public void pay() {
		System.out.println("This is credit card payment...");
		
	}
	
}

