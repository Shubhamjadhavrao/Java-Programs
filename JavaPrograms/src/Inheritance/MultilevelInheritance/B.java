package Inheritance.MultilevelInheritance;

public class B extends A {
	public void mult() {
		a = 23;
		b = 45;
		c = a * b;
		System.out.println("mult of two numbers:" + c);
	}

	public void Div() {
		a = 34;
		b = 45;
		c = a / b;
		System.out.println("Div of two numbers:" + c);

	}

}
