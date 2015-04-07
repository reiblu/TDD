import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class MoveCardControllerTest {
    
    private Deck baraja = new Deck();
	private Waste waste = new Waste();
	private Foundation foundation = new Foundation();
	MoveCardController moveCardController = new MoveCardController();

    @Test
    public void moveFromDeckToWasteTest() {
     
    	this.moveCardController.setDeck(baraja);
    	this.moveCardController.setWaste(waste);
        
        this.baraja.barajar(52);
        this.waste.tener(0);
        int deckSize = moveCardController.getDeckSize();
        int wasteSize = moveCardController.getWasteSize();
        
        ArrayList<Card> deck = moveCardController.getDeck();
        ArrayList<Card> aux = new ArrayList<Card>();
        for (int i = 0; i < 3; i++) {
			aux.add(deck.get(i));
		}
        moveCardController.moveFromDeckToWaste();
        assertEquals(deckSize-3,moveCardController.getDeckSize());
        assertEquals(wasteSize+3,moveCardController.getWasteSize());
        ArrayList<Card> waste = moveCardController.getWaste();
        for (Card card : waste) {
			assertFalse(card.isCovered());
		}
        for (int i = 0; i < 3; i++) {
			assertEquals(aux.get(i),waste.get(i));
		}
        
        this.baraja.barajar(2);
        this.waste.tener(0);
        int deckSize2 = moveCardController.getDeckSize();
        int wasteSize2 = moveCardController.getWasteSize();
        
        moveCardController.moveFromDeckToWaste();
        assertEquals(deckSize2-2,moveCardController.getDeckSize());
        assertEquals(wasteSize2+2,moveCardController.getWasteSize());
        ArrayList<Card> waste2 = moveCardController.getWaste();
        for (Card card : waste2) {
			assertFalse(card.isCovered());
		}
        
        this.baraja.barajar(1);
        this.waste.tener(0);
        int deckSize3 = moveCardController.getDeckSize();
        int wasteSize3 = moveCardController.getWasteSize();
        
        moveCardController.moveFromDeckToWaste();
        assertEquals(deckSize3-1,moveCardController.getDeckSize());
        assertEquals(wasteSize3+1,moveCardController.getWasteSize());
        ArrayList<Card> waste3 = moveCardController.getWaste();
        for (Card card : waste3) {
			assertFalse(card.isCovered());
		}
        
        this.baraja.barajar(0);
        this.waste.tener(9);
        int deckSize4 = moveCardController.getDeckSize();
        int wasteSize4 = moveCardController.getWasteSize();
        
        moveCardController.moveFromDeckToWaste();
        assertEquals(deckSize4,moveCardController.getDeckSize());
        assertEquals(wasteSize4,moveCardController.getWasteSize());
        ArrayList<Card> waste4 = moveCardController.getWaste();
        for (Card card : waste4) {
			assertFalse(card.isCovered());
		}
       
    }
    
    @Test
    public void moveFromWasteToFoundationsTest(){
    	this.moveCardController.setWaste(waste);
    	this.moveCardController.setFoundation(foundation);
    	
    	ArrayList<Card> listaAux = new ArrayList<Card>();
    	listaAux.add(new Card(3,1,false));
    	this.waste.tener(4);
    	this.waste.anadir(listaAux);
    	
    	Card cardWaste = waste.getPeek();
    	Card cardFoundation = foundation.getPeek(cardWaste.getSuit());
  
    	assertTrue(cardFoundation.next(cardWaste));
    	moveCardController.moveFromWasteToFoundations();
    		
    }
    
    @Test
    public void moveFromWasteToDeckTest(){
        this.moveCardController.setDeck(baraja);
        this.moveCardController.setWaste(waste);
        
        this.baraja.barajar(0);
        this.waste.tener(7);
        ArrayList<Card> listaMover = waste.getWaste();
        assertTrue(baraja.isEmpty());
        assertFalse(waste.isEmpty());
        moveCardController.moveFromWasteToDeck();
        ArrayList<Card> listaMovida = baraja.getBaraja();
        for (Card card : listaMovida) {
            assertTrue(card.isCovered());
        }
        for (int i = 0; i < listaMovida.size(); i++) {
            assertEquals(listaMover.get(i),listaMovida.get(i));
        }
    }

}
