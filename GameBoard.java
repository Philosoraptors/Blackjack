import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import javax.imageio.*;

public class GameBoard extends JPanel {
   static int WindowWidth = 900;
   static int WindowHeight = 700;
   static int Nim = 54;
   static Random rand = new Random();

static ArrayList<BufferedImage> Deck = new ArrayList<BufferedImage>();
 
   public GameBoard(){
      setPreferredSize(new Dimension(WindowWidth,WindowHeight));
      setBackground(new Color(0, 255, 0, 128));
   }
 
  static public void loadDeck() throws java.io.IOException {
      for (int ix = 1; ix <= Nim; ix++)
        Deck.add(ImageIO.read(new File("classic-cards/" + ix + ".png" )));
  }
 
  static public void showCards() {
     JFrame frame = new JFrame("BlackJack");
     Container cnt = frame.getContentPane();
     GameBoard pnl = new GameBoard();
     cnt.add(pnl);
     frame.pack();
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
  public void paintComponent(Graphics gr){
    BufferedImage card;
     super.paintComponent(gr);
     for (int ix = 1; ix < 100; ix ++ ) {
       card = Deck.get(rand.nextInt(Nim));
       gr.drawImage(card, rand.nextInt(WindowWidth - card.getWidth()),
                    rand.nextInt(WindowHeight - card.getHeight()), (ImageObserver)null);
     }
 
   }

/*  public void drawCard(int a, int x, int y) {
    int cardIndex = a;
    int xCord = x;
    int yCord = y;
    BufferedImage card;
      card = Deck.get(cardIndex);
      gr.drawImage(card,xCord,yCord,(ImageObserver)null);
  }
*/ 

   public static void main (String[] args) throws java.io.IOException {
     loadDeck();
      showCards();
    }
 
}
