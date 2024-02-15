import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class keyboardEventExample extends Applet implements KeyListener
{
  char ch;
  String str;
  public void init()            // register the KeyListener with Applet
  {
    addKeyListener(this);
  }
       // override all the 3 abstract methods of KeyListener interface
  public void keyPressed(KeyEvent e)   {   }
  public void keyReleased(KeyEvent e)  {   }
  public void keyTyped(KeyEvent e)  
  {  
    ch = e.getKeyChar();
    if(ch == 'a')
      str = "a for apple";    
    else if(ch == 'e')
      str = "e for elephant";    
    else if(ch == 'i')
      str = "i for igloo";    
    else if(ch == 'o')
      str = "o for ox";    
    else if(ch == 'u')
      str = "u for umbrella";    
    else
      str = "Type only vowels a, e, i, o, u only";    

    repaint();
  }    

  public void paint(Graphics g)
  {
    g.drawString("He", 100, 150);
    showStatus("You typed " + ch + " character");
  }
}

/*
<applet code="keyboardEventExample" width=600 height=600>
</applet>
*/