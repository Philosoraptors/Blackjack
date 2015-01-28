/**
 * Card.java
 */
import java.util.*;

public class Card implements Showable {

    public static final String[] SUITS = {
	"clubs",
	"spades",
	"hearts",
	"diamonds"
    };
    
    public static final String[] VALUES = {
	"Two",
	"Three",
	"Four",
	"Five",
	"Six",
	"Seven",
	"Eight",
	"Nine",
	"Ten",
	"Jack",
	"Queen",
	"King",
	"Ace"
    };
    
    
    private int id;
    
    public Card(int i) {
	id = i;
    }
}
