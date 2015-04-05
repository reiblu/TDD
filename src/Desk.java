import java.util.ArrayList;


public class Desk {
	
	private ArrayList<Card> baraja = new ArrayList<Card>();
	
	public Desk(){
		this.barajar();
	}
	
	public void barajar(int numero){
		baraja = CardsFactory.createCardList(numero, true);
	}
	
	public void barajar() {
        
		baraja = CardsFactory.createCardList(52, true);
	}
	
	public int numCards(){
		return this.baraja.size();
	}

	public ArrayList<Card> getBaraja() {
		return baraja;
	}

	public void reparto() {
		for (int i = 0; i < 28; i++) {
			this.baraja.remove(0);
		}
		
		
	}
	
	


}
