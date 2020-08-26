package Test;

public class Reverse_Integer {
	
	public static void main(String[] args) {		
		String s ="1234567890000";		
		//System.out.println(s.rev);	
		int len = s.length();
		String rev = "";		
		for(int i=len-1;i>=0;i--) {		
			rev = rev + s.charAt(i);
		}	
		System.out.println(rev);
		
		StringBuffer sfb = new StringBuffer(s);
		System.out.println(sfb.reverse());
		
		
		
		
	}
}
