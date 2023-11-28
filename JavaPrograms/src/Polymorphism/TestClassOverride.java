package Polymorphism;

public class TestClassOverride {

	public static void main(String[] args) {
		shape r = new triangle();
//		shape s = new shape();
//		s.draw();
//		triangle t = new triangle();
//		 t.draw();
		r.draw();
		r.getClass();
		System.out.println(r.toString());
		System.out.println(r.hashCode());
		System.out.println(r.equals(r));
		System.out.println(r.getClass().getName());
	    
	}
}