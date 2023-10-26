package Encapsulation;

 class Student {
	/**
	 * data hiding 
	 */
	private String StudentName;
	private int StudentRollNo;
	private int StudentAge;

	
	/**
	 * @param you can use getter/setter method for accessing  private class/method
	 */
	public void setName(String newName) {
		StudentName= newName;
	}
	public void setRoll(int newRoll) {
		StudentRollNo = newRoll;
	}
	
	public void setAge(int newAge) {
		StudentAge = newAge;
	}
	
	public String getStudentName() {
		return StudentName;
	}
	
	public int getStudentRollNo() {
		return StudentRollNo;
	}
	
	public int getStudentAge() {
		return StudentAge;
	}
}
