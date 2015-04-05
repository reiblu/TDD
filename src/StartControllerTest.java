import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StartControllerTest {

	StartController startController;

	@Before
	public void before() {
		startController = new StartController();
	}

	@Test
	public void isEmptyAllFoundationsTest() {

		assertTrue(startController.isEmptyAllFoundations());

	}

	@Test
	public void peeksEachTableauTest() {

		ArrayList<Card> peeksEachTableau = startController.peeksEachTableau();
		assertEquals(7, peeksEachTableau.size());
		for (Card card : peeksEachTableau) {
			assertNotNull(card);
			assertTrue(card.uncovered());
			int comprobacion = 0;
			for (Card card1 : peeksEachTableau) {
				if (card.equals(card1)) {
					comprobacion++;
				}
			}
			assertEquals(1, comprobacion);
		}

	}

	@Test
	public void checkDeskTest() {

		ArrayList<Card> deskCards = startController.deskCards();
		assertEquals(24, deskCards.size());
		for (Card card : deskCards) {
			assertNotNull(card);
			assertTrue(card.covered());
			int comprobacion = 0;
			for (Card card1 : deskCards) {
				if (card.equals(card1)) {
					comprobacion++;
				}
			}
			assertEquals(1, comprobacion);

		}

	}

	@Test
	public void randomCards() {

		List<ArrayList<Card>> barajas = new ArrayList<ArrayList<Card>>();
		for (int i = 0; i < 50; i++) {
			startController.baraja();
			barajas.add(startController.deskCards());
		}
		ArrayList<Card> barajaOriginal = barajas.get(0);
		for (int i = 0; i < 52; i++) {
			int comprobacion = 0;
			for (int j = 0; j < barajas.size(); j++) {
				if (barajaOriginal.get(i).equals(barajas.get(j).get(i))) {
					comprobacion++;
				}
			}
			
			assertTrue(comprobacion<(barajas.size()/52));
			
		}
		

	}

}
