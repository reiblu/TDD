import java.util.ArrayList;
import java.util.Random;


public class Tableau {
	
	public Tableau(){
		
	}

	public ArrayList<Card> getTableauPeek() {
        ArrayList<Card> result = new ArrayList<Card>();
        
        for (int i = 0; i < 7; i++) {
            Card card;
            do {
                Random r = new Random();
                card = new Card(r.nextInt(4), r.nextInt(13), false);
            } while (result.contains(card));
            result.add(card);
        }
        
        return result;
	}
	
	public ArrayList<Card> getTableauRest() {
        ArrayList<Card> result = new ArrayList<Card>();
        
        for (int i = 0; i < 21; i++) {
            Card card;
            do {
                Random r = new Random();
                card = new Card(r.nextInt(4), r.nextInt(13), true);
            } while (result.contains(card));
            result.add(card);
        }
        
        return result;
	}

}
