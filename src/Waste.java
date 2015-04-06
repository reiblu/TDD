import java.util.ArrayList;

public class Waste {

	private ArrayList<Card> waste = new ArrayList<Card>();
	
	public Waste(){
		
	}
	
	public void tener(int numero){
		waste = CardsFactory.createCardList(numero, true);
	}
	
	public int numCards(){
		return this.waste.size();
	}

	public ArrayList<Card> getWaste() {
		return waste;
	}

	public void anadir(ArrayList<Card> moverCartas) {
		for (Card card : moverCartas) {
			card.unCovered();
		}
		waste.addAll(moverCartas);
		
	}
		
	
}
