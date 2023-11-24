import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Card {
    String suit;
    String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return suit + value;
    }
}
