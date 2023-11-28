package Polymorphism;

/**
 * Method Overloading
 */
public class A {
	int c;
	int add() {
		int a = 10, b = 40, c;
		c = a + b;
		return c;

	}

	void add(int x, int y) {
		int c;
		c = x + y;
		System.out.println(c);
	}

	void add(int x, double y) {
		double c;
		c = x + y;
		System.out.println(c);
	}

	public static void main(String[] args) {
		A r = new A();
		r.add(200, 123);
		r.add(28, 199.99);
	int add =r.add();
		System.out.println(add);
	}

}
