/**
 * Showing your hand of 5 random cards for Black Jack
 */

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import javax.imageio.*;


public class CardImage extends JPanel{
  
   public CardImage(){
       setPreferredSize(new Dimension(500, 300));
   }
   
  static int cardNum = 52;
  public static int x = 50;
  public static int y = 10;
  
  static ArrayList<BufferedImage> Deck = new ArrayList<BufferedImage>();
  static ArrayList<BufferedImage> Hand = new ArrayList<BufferedImage>();
  
  static BufferedImage pickcard;
 
  
  public static void loadDeck(){
    try{ 
    for (int num = 1; num <= cardNum ; num++)
     Deck.add(ImageIO.read(new File("classic-cards/" + num + ".png")));
    } catch (IOException e){
      
      System.out.println("Here is the problem");
      
    }
  }
       
  public static void yourHand(){
    
    Random rand = new Random();
      for(int i =0; i < 5; i++){
        int rnd = rand.nextInt(cardNum);
        System.out.println(rnd);
        Hand.add(Deck.get(rnd));
     }
      
      
      JFrame frame = new JFrame("Your hand");
      frame.setVisible(true);
      Container cnt = frame.getContentPane();
      CardImage pnl = new CardImage();
      cnt.add(pnl);
      frame.pack();
      
      
     
  }
      
     public void paintComponent(Graphics g) {
      super.paintComponent(g);
     
     
      x = 10;
      
      y += 10;
       
      for(int i =0; i < 5; i++){
        g.drawImage(Hand.get(i), this.x, this.y, this);
        x += 80;
     }
     
  }


   public static void main (String [] args){
    loadDeck();
     yourHand();

  }
  
}

