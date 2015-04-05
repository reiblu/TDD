import java.util.ArrayList;
import java.util.Random;


public class CardsFactory {
	
	public static ArrayList<Card> createCardList(int cantidad, boolean cover){
		ArrayList<Card> result = new ArrayList<Card>();
		
		for (int i = 0; i < cantidad; i++) {
			Card card;
			do {
				Random r = new Random();
				card = new Card(r.nextInt(4), r.nextInt(13), cover);
			} while (result.contains(card));
			result.add(card);
		}

		return result;
	}

}
