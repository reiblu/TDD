import java.util.ArrayList;

public class Tableau {

	public Tableau() {

	}

	public ArrayList<Card> getTableauPeek() {
		return CardsFactory.createCardList(7, false);
	}

	public ArrayList<Card> getTableauRest() {
		return CardsFactory.createCardList(21, true);
	}

}
