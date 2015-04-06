import java.util.ArrayList;
import java.util.List;

public class Foundation {

	private List<ArrayList<Card>> foundation;

	public Foundation() {
		
		this.foundation = new ArrayList<ArrayList<Card>>();
		for (int i = 0; i < 4; i++) {
			this.foundation.add(new ArrayList<Card>());
		}

	}

	public int numCards(int suit) {
		return this.foundation.get(suit).size();
	}

	public ArrayList<Card> getFoundation(int suit) {
		return foundation.get(suit);
	}

	public Card getPeek(int suit) {
		ArrayList<Card> palo = foundation.get(suit);
		if(numCards(suit)==0){
			return new Card(suit,0,false);
		}
		Card carta = palo.get(numCards(suit)-1);
		return carta;
	}

	public boolean canAdd(Card cardWaste) {
		return getPeek(cardWaste.getSuit()).next(cardWaste);
	}

	public void Add(Card cardWaste) {
		this.foundation.get(cardWaste.getSuit()).add(cardWaste);
		
	}

}
