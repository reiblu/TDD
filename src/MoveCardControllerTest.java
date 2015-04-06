import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class MoveCardControllerTest {
    
    private Deck baraja = new Deck();
	private Waste waste = new Waste();
	MoveCardController moveCardController = new MoveCardController(baraja,waste);

    @Test
    public void moveFromDeckToWasteTest() {
     
        MoveCardController moveCardController1 = new MoveCardController(baraja,waste);
        MoveCardController moveCardController2 = new MoveCardController(baraja,waste);
        MoveCardController moveCardController3 = new MoveCardController(baraja,waste);
        MoveCardController moveCardController4 = new MoveCardController(baraja,waste);
        
        this.baraja.barajar(52);
        this.waste.tener(0);
        int deckSize = moveCardController.getDeckSize();
        int wasteSize = moveCardController.getWasteSize();
        
        ArrayList<Card> deck = moveCardController.getDeck();
        ArrayList<Card> aux = new ArrayList<Card>();
        for (int i = 0; i < 3; i++) {
			aux.add(deck.get(i));
		}
        moveCardController1.moveFromDeckToWaste();
        assertEquals(deckSize-3,moveCardController.getDeckSize());
        assertEquals(wasteSize+3,moveCardController.getWasteSize());
        ArrayList<Card> waste = moveCardController1.getWaste();
        for (Card card : waste) {
			assertFalse(card.isCovered());
		}
        for (int i = 0; i < 3; i++) {
			assertEquals(aux.get(i),waste.get(i));
		}
        
        this.baraja.barajar(2);
        this.waste.tener(0);
        
        moveCardController2.moveFromDeckToWaste();
        assertEquals(deckSize-2,moveCardController.getDeckSize());
        assertEquals(wasteSize+2,moveCardController.getWasteSize());
        ArrayList<Card> waste2 = moveCardController1.getWaste();
        for (Card card : waste2) {
			assertFalse(card.isCovered());
		}
        
        this.baraja.barajar(1);
        this.waste.tener(0);
        
        moveCardController3.moveFromDeckToWaste();
        assertEquals(deckSize-1,moveCardController.getDeckSize());
        assertEquals(wasteSize+1,moveCardController.getWasteSize());
        ArrayList<Card> waste3 = moveCardController1.getWaste();
        for (Card card : waste3) {
			assertFalse(card.isCovered());
		}
        
        this.baraja.barajar(0);
        this.waste.tener(9);
        
        moveCardController4.moveFromDeckToWaste();
        assertEquals(0,moveCardController.getDeckSize());
        assertEquals(9,moveCardController.getWasteSize());
        ArrayList<Card> waste4 = moveCardController1.getWaste();
        for (Card card : waste4) {
			assertFalse(card.isCovered());
		}
       
    }

}
