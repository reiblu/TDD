import java.util.ArrayList;


public class StartController {
	
	private Deck baraja = new Deck();
	private Tableau tab;

    public boolean isEmptyAllFoundations() {
        
        return true;
    }

    public ArrayList<Card> peeksEachTableau() {

    	return this.tab.getTableauPeek();
    	
    }

	public ArrayList<Card> deskCards() {
	
		return this.baraja.getBaraja();
		
	}

	public void barajar() {
		
		this.baraja.barajar();
		
	}

	public void repartir() {
		tab = new Tableau();
		baraja.reparto();
		
	}

	public boolean isEmptyWaste() {
		return true;
	}

	public ArrayList<Card> restEachTableau() {
		return this.tab.getTableauRest();
	}

}
