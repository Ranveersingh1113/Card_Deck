# Card_Deck


## 📌 About
This is a **Java-based Menu-Driven Card Deck Program** that allows users to interact with a deck of 52 playing cards. The program supports various operations such as shuffling, dealing cards, comparing cards, and searching for specific cards.

## 🛠 Features
- **Create a deck** of 52 cards with 4 suits and 13 ranks.
- **Print the entire deck**.
- **Print a specific card** based on user input.
- **Compare two cards** to check if they belong to the same suit or have the same rank.
- **Find a card** in the deck.
- **Deal 5 random cards**.
- **Shuffle the deck** to randomize card order.
- **Menu-driven interface** for user interaction.

---

## 📂 Project Structure
## 📝 Classes & Methods

### **1️⃣ Card.java**
This class represents a single **playing card** with a **suit** and a **rank**.

| Method | Description |
|--------|------------|
| `Card(String suit, String rank)` | Constructor to create a new card. |
| `String getSuit()` | Returns the suit of the card. |
| `String getRank()` | Returns the rank of the card. |
| `void printCard()` | Prints the card in the format `"Rank of Suit"`. |
| `boolean sameCard(Card other)` | Checks if two cards belong to the same suit. |
| `boolean compareCard(Card other)` | Checks if two cards have the same rank. |
| `String toString()` | Returns the card as a formatted string. |

---

### **2️⃣ Deck.java**
This class manages the **deck of 52 cards** and provides various operations on the deck.

| Method | Description |
|--------|------------|
| `Deck()` | Constructor that automatically creates a deck of 52 cards. |
| `void createDeck()` | Initializes a standard deck of 52 cards. |
| `void printDeck()` | Prints all cards in the deck. |
| `Card findCard(String rank, String suit)` | Searches for a specific card in the deck and returns it. |
| `void dealCard()` | Randomly selects and prints 5 cards from the deck. |
| `void shuffleDeck()` | Shuffles the deck randomly. |

---

### **3️⃣ Main.java**
This is the **menu-driven interface** that allows users to interact with the deck.

| Menu Option | Functionality |
|------------|--------------|
| **1. Print Deck** | Displays all 52 cards in the deck. |
| **2. Print a Specific Card** | User inputs rank and suit, and the program prints the card. |
| **3. Check if Two Cards are from the Same Suit** | Compares two user-input cards and checks if they belong to the same suit. |
| **4. Check if Two Cards have the Same Rank** | Compares two user-input cards and checks if they have the same rank. |
| **5. Find a Specific Card** | Searches for a card in the deck based on user input. |
| **6. Deal 5 Random Cards** | Prints 5 random cards from the deck. |
| **7. Shuffle Deck** | Randomly shuffles the deck. |
| **8. Exit** | Terminates the program. |
