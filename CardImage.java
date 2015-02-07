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
  public static int y = 100;
  
  static ArrayList<BufferedImage> Card = new ArrayList<BufferedImage>();
  
  static BufferedImage pickcard;
 
  
  public static void loadDeck(){
    try{ 
    for (int num = 1; num <= cardNum ; num++)
     Card.add(ImageIO.read(new File("classic-cards/" + num + ".png")));
    } catch (IOException e){
      
    }
  }
       
  public static void yourHand(){
      JFrame frame = new JFrame("Your hand");
      frame.setVisible(true);
      Container cnt = frame.getContentPane();
      CardImage pnl = new CardImage();
      cnt.add(pnl);
      frame.pack();
     
  }
      
     public void paintComponent(Graphics g) {
      super.paintComponent(g);
      for(int i =0; i < 5; i++){
        Random rand = new Random();
        pickcard = Card.get(rand.nextInt(cardNum));
        g.drawImage(pickcard, this.x, this.y, this);
        x += 80;
     }
  }


   public static void main (String [] args){
    //loadDeck();
     yourHand();
      loadDeck();
    
  }
  
}
