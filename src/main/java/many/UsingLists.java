package many;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsingLists {
  public static void showAllElements(List<String> ls) {
    for (String s : ls) {
      System.out.println(">> " + s);
    }
  }

  // NO default args, no named argument passing
  // Method overloading
  public static void showAllElements(String[] ls) {
    for (String s : ls) {
      System.out.println("++>> " + s);
    }
  }

  // varargs are passed as an array...
  public static void showAll(String x, int ... numbers) {
    for (int n : numbers) {
      System.out.println("--- " + n);
    }
  }

  public static void main(String[] args) {
//    java.util.List<String> names = new java.util.ArrayList<>();
    List<String> names = new LinkedList<String>();
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila");
    System.out.println(names);
    System.out.println("First person is " + names.get(0));
    names.add(0, "Bernard");
    System.out.println(names);

    String [] names2 = {"Freddy", "Albert", "Alice"};
    System.out.println(names2); // YUK
    System.out.println(names2[0]);
//    names2[3] = "Bad";

    for (int idx = 0; idx < names2.length; idx++) {
      System.out.println("> " + names2[idx]);
    }
    showAllElements(names2);
    showAllElements(names);
    showAll("x", 1, 3, 5, 7, 9);
  }
}

