package operatorsetc;

public class Loops1 {
  public static void main(String[] args) {
    int count = 0;
    while (count < 3) { // must be boolean
      System.out.println("count is " + count);
//      count = count + 1;
//      count += 1;
      count++; // post increment, -- "pre" version
    }
    System.out.println("-----------------");
    for (int i = 3; i > 0; i--) {
      System.out.println("i is " + i);
    }

    // do while too...
  }
}
