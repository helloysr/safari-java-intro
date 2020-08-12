package operatorsetc;

public class FlowControl1 {
  public static void main(String[] args) {
    // boolean represents true or false
    boolean doIt = true;
    int bananasNeeded = 7;
    int bananasOnHand = 3;
    if (doIt) {
      System.out.println("Gosh, I guess that was true...");
    } else {
      System.out.println("Hmmm, that must have been...");
      System.out.println("Well, false, I suppose");
    }

    // comparisons == != < > <= >=
    // boolean logic && ||
    if (bananasNeeded <= bananasOnHand) {
      System.out.println("Got bananas :)");
    } else {
      System.out.println("go shopping");
    }

    String message = "Hello";
    String m = "He";
    m = m + "llo";
    System.out.println("message: " + message);
    System.out.println("m:       " + m);
    if (message == m) {
      System.out.println("they are the same object");
    } else {
      System.out.println("Nope different objects!");
    }
    if (message.equals(m)) {
      System.out.println("they are the equivalent objects");
    } else {
      System.out.println("Not equivalen objects!");
    }
// null represents "nothing here" but can cause problems.
    message = null;
    if (message != null) {
      System.out.println(message.toUpperCase());
    } else {
      System.out.println("Nothing to see here.");
    }
  }
}
