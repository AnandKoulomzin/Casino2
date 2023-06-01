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
        deal();
        players = new Player[2];
    }

    public void deal() {
        shuffle();
        Player player = new Player();
        player.hand = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Card card = deck.get(0);
            player.hand.add(card);
            deck.remove(0);
        }
        System.out.println(player.hand);
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
