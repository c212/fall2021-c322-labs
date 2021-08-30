
public class Two {
  public static void main (String[] args) {
    Collection<Integer> a = new TreeSet<Integer>(); 
    a.add(5); 
    a.add(9);
    a.add(13);
    a.add(6);
    a.add(4); 
    System.out.println( a ); 
    Iterator<Integer> iter = a.iterator(); 
    while (iter.hasNext()) {
      System.out.println(iter.next()); 
    }
  }
}
