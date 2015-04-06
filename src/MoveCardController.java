import java.util.ArrayList;


public class MoveCardController {
    
	private Desk baraja = new Desk();
    private int deckSize;
    private int wasteSize;
    
    public MoveCardController(int deckSize, int wasteSize){
        this.deckSize = deckSize;
        this.wasteSize = wasteSize;
    }

    public void moveFromDeckToWaste() {
        
    }

    public int getDeckSize() {
        return baraja.numCards();
    }

    public int getWasteSize() {
        return 0;
    }

	public ArrayList<Card> getWaste() {
		// TODO Auto-generated method stub
		return null;
	}
    
    


}
