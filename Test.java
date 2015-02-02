
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Test {
    
  public static void main(String[] args) {
  
  int firstNum = 0;
  Scanner scan = new Scanner(System.in);
  
//  System.out.println("Enter the first card index you would like to test \n This will print the information of 5 sequential cards");
  
//  firstNum = scan.nextInt();
  ArrayList<Card> testCards = new ArrayList<Card>();
  
  for (int i = 0; i < 52; i++){
    testCards.add(new Card(i+firstNum));
    System.out.println(testCards.get(i).cardVal());
    System.out.println(testCards.get(i).cardIndex());
    System.out.println(testCards.get(i).toString());
    System.out.println(testCards.get(i).cardSuite());
    System.out.println(testCards.get(i).cardName());
    System.out.println("");
  }
  
/*
  System.out.println(i.cardVal());
  System.out.println(i.toString());
  System.out.println(i.cardSuite);
  System.out.println(i.cardName());
  System.out.println(i.card.Index());
  System.out.println("");
*/
/*  
  
  Card a = new Card(0);
  Card b = new Card(1);
  Card c = new Card(2);
  Card d = new Card(3);
  Card e = new Card(4);
  
  System.out.println(a.cardVal());
  System.out.println(a.toString());
  System.out.println(a.cardSuite());
  System.out.println(a.cardName());
  System.out.println(a.cardIndex());
  System.out.println("");
   System.out.println(b.cardVal());
  System.out.println(b.toString());
  System.out.println(b.cardSuite());
  System.out.println(b.cardName());
System.out.println(b.cardIndex());
  System.out.println("");
  System.out.println(c.cardVal());
  System.out.println(c.toString());
  System.out.println(c.cardSuite());
  System.out.println(c.cardName());
System.out.println(c.cardIndex());
  System.out.println("");
  System.out.println(d.cardVal());
  System.out.println(d.toString());
  System.out.println(d.cardSuite());
  System.out.println(d.cardName());
System.out.println(d.cardIndex());
  System.out.println("");
  System.out.println(e.cardVal());
  System.out.println(e.toString());
  System.out.println(e.cardSuite());
  System.out.println(e.cardName());
System.out.println(e.cardIndex());
  System.out.println("");
*/

  }
}


