import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class StartControllerTest {

    StartController startController;
    
    @Before
    public void before(){
        startController = new StartController();
    }
    
    @Test
    public void isEmptyAllFoundationsTest() {
        
        assertTrue(startController.isEmptyAllFoundations());
        
    }
    
    @Test
    public void peeksEachTableauTest() {
        
    	int comprobacion = 0;
        ArrayList<Card> peeksEachTableau = startController.peeksEachTableau();
        assertEquals(7, peeksEachTableau.size());
        for (Card card : peeksEachTableau) {
            assertNotNull(card);
            assertTrue(card.uncovered());
            for (Card card1 : peeksEachTableau) {
				if (card.equals(card1)){
					comprobacion++;
				}
			}
            assertEquals(1,comprobacion);
            //comprobar que la carta esta solo una vez en el array
            //Un array 7x52 y lo llamo miles de veces, y cuenta en que posiciones del 1 al 7 ha salido cada carta, cuando termino
            //pongo un margen de variabilidad (con una vez 1/52)) -- entre 100 y 300 para que sea aleatorio.
        }
        
    }

}

//MoveCardController
//Un metodo que dada una lista de cartas te diga si son distintas y aleatorias
//Si sale grande lo partes despues en la refactorizacion