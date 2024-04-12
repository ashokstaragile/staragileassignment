package calc;

public class calc {
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
	
	   public static void main(String[] args) {
	        calc calculator = new calc();
	        
	        // Test the calculator methods
	        int a = 10;
	        int b = 5;
	        
	        System.out.println("Addition of " + a + " and " + b + " = " + calculator.sum(a, b));
	        System.out.println("substarction of " + a + " and " + b + " = " + calculator.sub(a, b));
	        System.out.println("multification of " + a + " and " + b + " = " + calculator.mul(a, b));
	        System.out.println("Division of " + a + " by " + b + " = " + calculator.div(a, b));
	    }

}
