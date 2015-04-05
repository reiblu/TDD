import java.util.ArrayList;


public class StartController {
	
	private Desk baraja = new Desk();
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

}
