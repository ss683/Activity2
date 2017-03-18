/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck one = new Deck(ranks1, suits1, values1);
		Deck two = new Deck(ranks2, suits2, values2);
		Deck three = new Deck(ranks3, suits3, values3);
		one.isEmpty();
		one.size();
		one.deal();
		two.isEmpty();
		two.size();
		two.deal();
		three.isEmpty();
		three.size();
		three.deal();
	}
}
