import java.util.ArrayList;
import java.util.Random;


public class Desk {
	
	private ArrayList<Card> baraja = new ArrayList<Card>();
	
	public Desk(){
		this.barajar();
	}
	
	public void barajar() {
        
		baraja = new ArrayList<Card>();
        for (int i = 0; i < 52; i++) {
            Card card;
            do {
                Random r = new Random();
                card = new Card(r.nextInt(4), r.nextInt(13), true);
            } while (baraja.contains(card));
            baraja.add(card);
        }
       
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
