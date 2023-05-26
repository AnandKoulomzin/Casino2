public class Card {
    public String suit;
    public String name;
    public int cardValue;
    public int suitValue; //change to parameters


    public Card(int cardNum, int suitNum) {
        if (suitNum==0) {
            suit = "spades";
        }
        else if (suitNum==1) {
            suit = "clubs";
        }
        else if (suitNum==2) {
            suit = "diamonds";
        }
        else if (suitNum==3) {
            suit = "hearts";
        }
        if (cardNum == 0) {
            name = "ace";
        }
        else if (cardNum == 1) {
            name = "2";
        }
        else if (cardNum == 2) {
            name = "3";
        }
        else if (cardNum == 3) {
            name = "4";
        }
        else if (cardNum == 4) {
            name = "5";
        }
        else if (cardNum == 5) {
            name = "6";
        }
        else if (cardNum == 6) {
            name = "7";
        }
        else if (cardNum == 7) {
            name = "8";
        }
        else if (cardNum == 8) {
            name = "9";
        }
        else if (cardNum == 9) {
            name = "10";
        }
        else if (cardNum == 10) {
            name = "jack";
        }
        else if (cardNum == 11) {
            name = "queen";
        }
        else if (cardNum == 12) {
            name = "king";
        }

    }
    public void printCardInfo() {
        System.out.println(name + " of " + suit);
    }

}
