package Encapsulation;

 class Spider {
	 
	private int value;// data hiding
	 
	 public void setValue(int x) { // data abstraction
		 value = x;
	}
		
	public int getValue() {
		return ++ value;
	}
 }
