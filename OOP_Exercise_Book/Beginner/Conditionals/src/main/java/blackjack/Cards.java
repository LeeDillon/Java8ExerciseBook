package blackjack;

public class Cards {

	public int play(int n1, int n2) {
		if(n1>21&&n2>21) {
			return 0;
		}
		else {
			if(n1>n2&&n1<22) {
				return n1;
			}
			else if (n2>n1&&n2<22){
				return n2;
			}
			else {
				return 5;
			}
		}
		
	}
}