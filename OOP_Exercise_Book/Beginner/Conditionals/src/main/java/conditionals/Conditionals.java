package conditionals;

public class Conditionals {

	
	
	public double equation(double n1, double n2, boolean assertion) {
		if(n1 % 2 != 0&&n2 % 2 != 0) {		
			if(assertion == true) {
				return n1 + n2;
			}
			else {
			return n1 * n2;
			}
	}
		else {
			return 0;
		}
	}
	public double equation2(double n1, double n2, boolean assertion) {
		if(n1 % 2 == 0||n2 % 2 == 0) {	
			return 0;
			
	}
		else {
			if(assertion == true) {
				return n1 + n2;
			}
			else {
			return n1 * n2;
			}
		}
	}
}
