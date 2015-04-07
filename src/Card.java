
public class Card {
    
    private int suit;
    private int number;
    private boolean cover;

    public Card(int suit, int number, boolean cover) {
        this.suit = suit;
        this.number = number;
        this.cover = cover;
    }
    
    @Override
    public boolean equals(Object object){
        assert object instanceof Card;
        Card card = (Card) object;
        return card.suit == suit && card.number == number;
    }

	public boolean isCovered() {
		return this.cover;
	}
	
	public void unCovered(){
		this.cover = false;
	}
	
	public void covered(){
	    this.cover = true;
	}

	public int getSuit() {
		return suit;
	}

	public int getNumber() {
		return number;
	}

	public boolean next(Card cardWaste) {
		return this.number+1 == cardWaste.number;
	}

}
