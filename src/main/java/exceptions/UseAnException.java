package exceptions;

import java.io.*;

public class UseAnException {
  public static void main(String[] args)/* throws FileNotFoundException */ {
    int[] nums = {1, 2, 3};
//    System.out.println("fourth item is " + nums[3]);

//    try {
//      BufferedReader br = new BufferedReader(new FileReader("data.txt"));
    // "try with resources" guarantees to close the file!!!
    try (BufferedReader br = new BufferedReader(new FileReader("data.txt"));) {
      System.out.println("now about to read the file...");
      String s;
      while ((s = br.readLine()) != null) {
        System.out.println("> " + s);
      }
      System.out.println("End of file...");
    } catch (FileNotFoundException fnfe) {
      System.out.println("oops that broke, message is " + fnfe.getMessage());
    } catch (IOException ioe) {
      System.out.println("IO problem: " + ioe.getMessage());
    }
//    finally {
//      // close the file
//    }

    System.out.println("Still going");
  }
}
