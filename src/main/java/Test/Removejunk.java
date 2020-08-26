package Test;

public class Removejunk {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "##%$$$$$I am Selenium&&^%%%%%%%@@";
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", " "));
		
		
	}

	
	
	
	
}
