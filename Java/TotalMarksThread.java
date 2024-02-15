


// 3. Write an Applet program (or Swing program) to capture any keyboard event of your choice and display an output. Below is an example. However, I would strongly encourage each one to explore programs different from the one below.

// import java.applet.Applet;
// import java.awt.Graphics;
// import java.awt.event.KeyListener;
// import java.awt.event.KeyEvent;

// public class keyboardEventExample extends Applet implements KeyListener
// {
//   char ch;
//   String str;
//   public void init()            // register the KeyListener with Applet
//   {
//     addKeyListener(this);
//   }
//        // override all the 3 abstract methods of KeyListener interface
//   public void keyPressed(KeyEvent e)   {   }
//   public void keyReleased(KeyEvent e)  {   }
//   public void keyTyped(KeyEvent e)  
//   {  
//     ch = e.getKeyChar();
//     if(ch == 'a')
//       str = "a for apple";    
//     else if(ch == 'e')
//       str = "e for elephant";    
//     else if(ch == 'i')
//       str = "i for igloo";    
//     else if(ch == 'o')
//       str = "o for ox";    
//     else if(ch == 'u')
//       str = "u for umbrella";    
//     else
//       str = "Type only vowels a, e, i, o, u only";    

//     repaint();
//   }    

//   public void paint(Graphics g)
//   {
//     g.drawString(str, 100, 150);
//     showStatus("You typed " + ch + " character");
//   }
// }

// 1. Class TotalMarks has class variables and methods to calculate the total marks of a student. 
// Student is a derived class of class TotalMarks and class Student is also a thread. 
// Objective of the program is to spawn a new thread for each student. 
// Each thread (that corresponds to each student) calculates the total marks a student has obtained using methods in classes 
// Student AND TotalMarks and prints the same along with some name that uniquely identifies each student thread. 
// Add necessary and meaningful class variables and methods in both the classes to achieve the above objective.

class TotalMarks{
    int phy;
    int chem;
    int math;

    TotalMarks(int phy, int chem, int math){
        this.phy = phy;
        this.chem = chem;
        this.math = math;
    }

    int calculate(){
        return phy + chem + math;
    }
}

class Student extends TotalMarks implements Runnable{
    Thread thread;
    String name;
    Student(String name, int phy, int chem, int math){
        super(phy, chem, math);
        this.name = name;

        thread = new Thread(this);
        thread.start();

        try{
            thread.join();
        }

        catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }

    public void run(){
        int total = calculate();
        System.out.println("Total Marks of " + name + " = " + total);
    }
}


public class TotalMarksThread{
    public static void main(String[] args){
        Student student1 = new Student("John", 10, 20, 30);
        Student student2 = new Student("Jack", 11, 21, 31);

    }
}