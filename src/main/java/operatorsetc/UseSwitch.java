package operatorsetc;

public class UseSwitch {
  public static void main(String[] args) {
    int count = 99;
    switch(count) { // type for switching, int, or smaller, String, "enum"
      case 1: // case values MUST BE CONSTANTS
        System.out.println("looks like one");
        break;
      case 2:
        System.out.println("looks like two");
        break;
      case 3:
        System.out.println("it's a three");
        break;
      default:
        System.out.println("Whatever...");
    }
  }
}
