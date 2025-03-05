/*
Name: [Your Name]
PRN: [Your PRN]
Batch: [Your Batch]
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Specific Card");
            System.out.println("3. Check if Two Cards are from the Same Suit");
            System.out.println("4. Check if Two Cards have the Same Rank");
            System.out.println("5. Find a Specific Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter suit: ");
                    String suit = scanner.nextLine();
                    System.out.print("Enter rank: ");
                    String rank = scanner.nextLine();
                    Card foundCard = deck.findCard(rank, suit);
                    if (foundCard != null) {
                        foundCard.printCard();
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter first card's suit: ");
                    String suit1 = scanner.nextLine();
                    System.out.print("Enter first card's rank: ");
                    String rank1 = scanner.nextLine();
                    System.out.print("Enter second card's suit: ");
                    String suit2 = scanner.nextLine();
                    System.out.print("Enter second card's rank: ");
                    String rank2 = scanner.nextLine();

                    Card card1 = deck.findCard(rank1, suit1);
                    Card card2 = deck.findCard(rank2, suit2);
                    
                    if (card1 != null && card2 != null) {
                        System.out.println(card1.sameCard(card2) ? "Both cards belong to the same suit." : "Cards are from different suits.");
                    } else {
                        System.out.println("Invalid card input.");
                    }
                    break;
                case 4:
                    System.out.print("Enter first card's suit: ");
                    String suitA = scanner.nextLine();
                    System.out.print("Enter first card's rank: ");
                    String rankA = scanner.nextLine();
                    System.out.print("Enter second card's suit: ");
                    String suitB = scanner.nextLine();
                    System.out.print("Enter second card's rank: ");
                    String rankB = scanner.nextLine();

                    Card cardA = deck.findCard(rankA, suitA);
                    Card cardB = deck.findCard(rankB, suitB);

                    if (cardA != null && cardB != null) {
                        System.out.println(cardA.compareCard(cardB) ? "Both cards have the same rank." : "Cards have different ranks.");
                    } else {
                        System.out.println("Invalid card input.");
                    }
                    break;
                case 5:
                    System.out.print("Enter suit: ");
                    String findSuit = scanner.nextLine();
                    System.out.print("Enter rank: ");
                    String findRank = scanner.nextLine();
                    Card searchCard = deck.findCard(findRank, findSuit);
                    if (searchCard != null) {
                        System.out.println("Card Found: " + searchCard);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case 6:
                    deck.dealCard();
                    break;
                case 7:
                    deck.shuffleDeck();
                    break;
                case 8:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
