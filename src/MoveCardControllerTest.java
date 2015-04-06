import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class MoveCardControllerTest {
    
    MoveCardController moveCardController;

    @Test
    public void moveFromDeckToWasteTest() {
     
        MoveCardController moveCardController1 = new MoveCardController(52,0);
        MoveCardController moveCardController2 = new MoveCardController(2,0);
        MoveCardController moveCardController3 = new MoveCardController(1,0);
        MoveCardController moveCardController4 = new MoveCardController(0,9);
        
        int deckSize = moveCardController.getDeckSize();
        int wasteSize = moveCardController.getWasteSize();
        
        ArrayList<Card> deck = moveCardController.getDeck();
        ArrayList<Card> aux = new ArrayList<Card>();
        for (int i = 0; i < 3; i++) {
			aux.add(deck.get(1));
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
        
        moveCardController2.moveFromDeckToWaste();
        assertEquals(deckSize-2,moveCardController.getDeckSize());
        assertEquals(wasteSize+2,moveCardController.getWasteSize());
        ArrayList<Card> waste2 = moveCardController1.getWaste();
        for (Card card : waste2) {
			assertFalse(card.isCovered());
		}
        
        moveCardController3.moveFromDeckToWaste();
        assertEquals(deckSize-1,moveCardController.getDeckSize());
        assertEquals(wasteSize+1,moveCardController.getWasteSize());
        ArrayList<Card> waste3 = moveCardController1.getWaste();
        for (Card card : waste3) {
			assertFalse(card.isCovered());
		}
        
        moveCardController4.moveFromDeckToWaste();
        assertEquals(0,moveCardController.getDeckSize());
        assertEquals(9,moveCardController.getWasteSize());
        ArrayList<Card> waste4 = moveCardController1.getWaste();
        for (Card card : waste4) {
			assertFalse(card.isCovered());
		}
       
    }

}
