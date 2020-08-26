package Test;

public class encapsulation {
	
	private int age;
	private String name;
	private int SSN;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		encapsulation enp = new encapsulation();
		enp.setAge(25);
		enp.setName("Tom Peter");
		enp.setSSN(123456);
		
		System.out.println("The obtained employee data is"+enp.getName());
		System.out.println("The obtained employee data is"+enp.getAge());
		System.out.println("The obtained employee data is "+enp.getSSN());
		
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sSN
	 */
	public int getSSN() {
		return SSN;
	}

	/**
	 * @param sSN the sSN to set
	 */
	public void setSSN(int sSN) {
		SSN = sSN;
	}

	
	
	
}
