package operatorsetc;

public class FlowExample2 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    if (sb == sb2) {
      System.out.println("Same object");
    }
    if (sb.equals(sb2)) {
      System.out.println("Equvalent object");
    }
    if (sb.toString().equals(sb2.toString())) {
      System.out.println("Equvalent text");
    }
    System.out.println("Finished...");
  }
}
