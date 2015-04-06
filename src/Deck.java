import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> baraja = new ArrayList<Card>();

	public Deck() {
		this.barajar();
	}

	public void barajar(int numero) {
		baraja = CardsFactory.createCardList(numero, true);
	}

	public void barajar() {

		baraja = CardsFactory.createCardList(52, true);
	}

	public int numCards() {
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

	public ArrayList<Card> moverCartas() {
		ArrayList<Card> aux = new ArrayList<Card>();
		if (numCards() >= 3) {
			aux = dameCartas(3);
		} else if (numCards() == 2) {
			aux = dameCartas(2);
		} else if (numCards() == 1) {
			aux = dameCartas(1);
		}
		return aux;
	}
	
	public ArrayList<Card> dameCartas(int numCartas){
		ArrayList<Card> listaCartas = new ArrayList<Card>();
		for (int j = 0; j < numCartas; j++) {
			listaCartas.add(this.baraja.get(0));
			this.baraja.remove(0);
		}
		return listaCartas;
	}

}
