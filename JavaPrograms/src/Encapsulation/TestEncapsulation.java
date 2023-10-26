package Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
		Student r = new Student();
		r.setName("Shubham");
		r.setAge(23);
		r.setRoll(28);
		System.out.println("StudentName"+ "_ " + r.getStudentName());
		System.out.println("StudentAge"+"_ " + r.getStudentAge());
		System.out.println("StudentRollNo"+"_ " + r.getStudentRollNo());
	}
}
