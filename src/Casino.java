import java.util.ArrayList;

public class Casino {

    ArrayList<Card> deck = new ArrayList<>();
    public Player[] players;

    public static void main(String[] args) {
        Casino table = new Casino();
    }

    public Casino() {
        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 4; y++) {
                deck.add(new Card(x, y));
            }
        }
        printDeck();
        shuffle();
        System.out.println("\nAfter shuffling:");
        printDeck();
        players = new Player[2];
    }

    public void deal () {
        shuffle();
        deck.get(0);
        deck.remove(0);
        deck.get(0);
        deck.remove(0);
    }

    public void printDeck() {
        for (int i = 0; i < 52; i++) {
            deck.get(i).printCardInfo();
        }
    }

    public void shuffle() {
        int size = deck.size();
        for (int i = 0; i < size - 1; i++) {
            int random = (int)(Math.random()*(size - i))+i;
            Card randomCard = deck.get(random);
            deck.set(random, deck.get(i));
            deck.set(i, randomCard);
        }
    }



    public void allPlayerScores() {

    }

    public void results() {

    }

}
