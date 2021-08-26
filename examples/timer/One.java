import javax.swing.Timer; 

public class One {
  public static void main(String[] args) {
    // https://docs.oracle.com/javase/tutorial/uiswing/misc/timer.html
    Timer timer = new Timer(1000, null);
    System.out.println( timer );      
  }
}
