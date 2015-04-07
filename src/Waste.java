import java.util.ArrayList;

public class Waste {

	private ArrayList<Card> waste = new ArrayList<Card>();
	
	public Waste(){
		
	}
	
	public void tener(int numero){
		waste = CardsFactory.createCardList(numero, false);
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

	public Card getPeek() {
		Card carta = waste.get(numCards()-1);
		return carta;
	}

    public boolean isEmpty() {
        return this.waste.size() == 0;
    }
		
	
}
