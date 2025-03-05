// Card.java
public class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public void printCard() {
        System.out.println(rank + " of " + suit);
    }

    public boolean sameCard(Card other) {
        return this.suit.equals(other.suit);
    }

    public boolean compareCard(Card other) {
        return this.rank.equals(other.rank);
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
