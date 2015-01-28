
import java.io.*;
import java.util.*;

public class Test {
    
  public static void main(String[] args) {
  
  Card a = new Card(1);
  Card b = new Card(10);
  Card c = new Card(22);
  Card d = new Card(30);
  Card e = new Card(50);
  
  System.out.println(a.cardVal());
  System.out.println(a.cardId());
  System.out.println(a.cardSuite());
  System.out.println(a.cardName());
   System.out.println(b.cardVal());
  System.out.println(b.cardId());
  System.out.println(b.cardSuite());
  System.out.println(b.cardName());
  System.out.println(c.cardVal());
  System.out.println(c.cardId());
  System.out.println(c.cardSuite());
  System.out.println(c.cardName());
  System.out.println(d.cardVal());
  System.out.println(d.cardId());
  System.out.println(d.cardSuite());
  System.out.println(d.cardName());
  System.out.println(e.cardVal());
  System.out.println(e.cardId());
  System.out.println(e.cardSuite());
  System.out.println(e.cardName());

  }
}
