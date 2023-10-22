package Inheritance.MultipleInheritance;

/**
 * class C is confuse which class is inherit 
 * shows memory duplication  
 */
public class C extends A,B { 
    void m1() {
    	System.out.println("C is inside  m1");
    }
}
