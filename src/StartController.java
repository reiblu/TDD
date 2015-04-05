import java.util.ArrayList;
import java.util.Random;


public class StartController {

    public boolean isEmptyAllFoundations() {
        
        return true;
    }

    public ArrayList<Card> peeksEachTableau() {
        ArrayList<Card> result = new ArrayList<Card>();
        
        for (int i = 0; i < 7; i++) {
            Card card;
            do {
                Random r = new Random();
                card = new Card(r.nextInt(4), r.nextInt(13));
            } while (result.contains(card));
            result.add(card);
        }
        
        return result;
    }

	public ArrayList<Card> deskCards() {
		 ArrayList<Card> result = new ArrayList<Card>();
	        
	        for (int i = 0; i < 52; i++) {
	            Card card;
	            do {
	                Random r = new Random();
	                card = new Card(r.nextInt(4), r.nextInt(13));
	            } while (result.contains(card));
	            result.add(card);
	        }
	        
	        return result;
	}

	public void baraja() {
		// TODO Auto-generated method stub
		
	}

}
