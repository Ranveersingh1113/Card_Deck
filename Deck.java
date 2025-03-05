// Deck.java
import java.util.*;

public class Deck {
    private ArrayList<Card> cards;
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public Deck() {
        createDeck();
    }

    public void createDeck() {
        cards = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public Card findCard(String rank, String suit) {
        for (Card card : cards) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                return card;
            }
        }
        return null;
    }

    public void dealCard() {
        Random random = new Random();
        HashSet<Integer> indices = new HashSet<>();
        while (indices.size() < 5) {
            indices.add(random.nextInt(cards.size()));
        }
        for (int index : indices) {
            cards.get(index).printCard();
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
        System.out.println("Deck shuffled successfully.");
    }
}
