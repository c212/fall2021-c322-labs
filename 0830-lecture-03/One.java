import java.math.BigDecimal; 

public class One {
  public static void main(String[] args) {
    System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1); 
    System.out.println(4.53 * 100); 
    System.out.println(4.35 * 100); // 434.99999999999994
    BigDecimal a = new BigDecimal("4.35"), b = new BigDecimal("100"); 
    BigDecimal result = a.multiply(b); 
    System.out.println( result );     
  } 
}
