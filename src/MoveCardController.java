import java.util.ArrayList;


public class MoveCardController {
    
	private Deck baraja = new Deck();
	private Waste waste = new Waste();
    
    public MoveCardController(Deck baraja, Waste waste){
        
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
		return this.baraja.getBaraja();
	}

	public ArrayList<Card> getDeck() {
		return this.waste.getWaste();
	}
    
    


}
