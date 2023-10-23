package SS;

public class recursiveGCD {

	public static void main(String[] args) {
		int a = 81;
		int b = 45;
		
		int result = getGCD(a,b);
		System.out.println("The GCD is: " + result);

	}
	public static int getGCD(int a, int b) {
		 //base case
		 if (b == 0) {
			 return a;
		 }
		 
		 return getGCD(b, a % b);
		 
	 }

}
