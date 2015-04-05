import static org.junit.Assert.*;

import org.junit.Test;


public class MoveCardControllerTest {
    
    MoveCardController moveCardController;

    @Test
    public void moveFromDeckToWasteTest() {
     
        MoveCardController moveCardController1 = new MoveCardController(52,0);
        MoveCardController moveCardController2 = new MoveCardController(3,0);
        MoveCardController moveCardController3 = new MoveCardController(2,0);
        MoveCardController moveCardController4 = new MoveCardController(1,0);
        MoveCardController moveCardController5 = new MoveCardController(0,9);
        
        int deckSize = moveCardController.getDeckSize();
        int wasteSize = moveCardController.getWasteSize();
        
        moveCardController1.moveFromDeckToWaste();
        assertEquals(deckSize-3,moveCardController.getDeckSize());
        assertEquals(wasteSize+3,moveCardController.getWasteSize());
        
        
        
        
       
       
    }

}
