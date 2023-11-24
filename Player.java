import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Player {
    String name;
    List<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public void receive(Card card) {
        hand.add(card);
    }

    @Override
    public String toString() {
        return "Player " + name + " has cards: " + hand;
    }
}
