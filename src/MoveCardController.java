import java.util.ArrayList;


public class MoveCardController {
    
	private Deck baraja = new Deck();
	private Waste waste = new Waste();
    
    public MoveCardController(){
        
    }

    public void moveFromDeckToWaste() {
        
    	ArrayList<Card> moverCartas = this.baraja.moverCartas();
    	this.waste.anadir(moverCartas);
    	
    }

    public int getDeckSize() {
        return this.baraja.numCards();
    }

    public int getWasteSize() {
        return this.waste.numCards();
    }

	public ArrayList<Card> getWaste() {
		return this.waste.getWaste();
	}

	public ArrayList<Card> getDeck() {
		return this.baraja.getBaraja();
	}

	public void setDeck(Deck baraja2) {
		this.baraja = baraja2;
	}

	public void setWaste(Waste waste2) {
		this.waste = waste2;
	}
    
    


}
