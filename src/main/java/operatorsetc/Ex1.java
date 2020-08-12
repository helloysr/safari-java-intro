package operatorsetc;

public class Ex1 {
  public static void main(String[] args) {
    int count;
    count = 3;
//    System.out.print("The count is ");
//    System.out.println(count);

    // + - * /
    count = 6 + count;
    // JAva will NOT lose meaning in assignment by assigning to "smaller" data
    // Must force with a "cast" if you really want to
//    int divided = (int)(count / 4.0);
    double divided = count / 4.0;
    System.out.println("The count is " + count);
    System.out.println("The result of division is " + divided);

    String message = "Hello, I am a piece of text";
//    String otherMessage = message.toUpperCase();
    message = message.toUpperCase();
    System.out.println(message);
//    System.out.println(otherMessage);
  }
}
