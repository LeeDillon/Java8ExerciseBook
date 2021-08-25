package blackjack;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cards cards = new Cards();
		System.out.println(cards.play(10,21));
		System.out.println(cards.play(20,18));
		System.out.println(cards.play(1,22));
		System.out.println(cards.play(22,23));
		System.out.println(cards.play(10,10));
	}

}
