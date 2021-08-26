import javax.swing.Timer;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.JFrame;

public class Nine implements ActionListener {
  int count;
  public void actionPerformed(ActionEvent e) {
    System.out.println(count++); 
  }
  public static void main(String[] args) {
    JFrame a = new JFrame(); 
    a.setSize(300, 200); 
    a.setVisible(true); 
    // https://docs.oracle.com/javase/tutorial/uiswing/misc/timer.html
    Timer timer = new Timer(1000, new Nine());     
    System.out.println( timer ); 
    timer.start();
  } 
}
