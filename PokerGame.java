import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PokerGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");

        for (int i = 0; i < 5; i++) {
            player1.receive(deck.deal());
            player2.receive(deck.deal());
        }

        System.out.println(player1);
        System.out.println(player2);
    }
}
