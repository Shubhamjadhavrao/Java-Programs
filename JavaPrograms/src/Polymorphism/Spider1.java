package Polymorphism;

/**
 * overload Method
 */
class Aa{
	
}
class B extends Aa{
	
}
class C extends B {
	
}



public class Spider1{
	static void overloadmethod(A a){
		System.out.println("Jay");
	}
	
	static void overloadmethod(B b) {
		System.out.println("Shree");
	}
	
	static void overloadmethod(Object obj) {
		System.out.println("Ram");
	}
	
	public static void main(String[] args) {
		C c = new C();
		overloadmethod(c);
	}
}

