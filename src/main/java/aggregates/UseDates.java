package aggregates;

public class UseDates {
  public static void main(String[] args) {
    // my birthday!

//    int myBirthDay = 22;
//    int myBirthMonth = 6;
//    int myBirthYear = 1980;
    Date myBirth = new Date(22, 6, 1980);
//    myBirth.day = 22;
//    myBirth.month = 6;
//    myBirth.year = 1980;

    int yourBirthDay = 1;
    int yourBirthMonth = 12;
    int yourBirthYear = 1995;

    Date yourBirth = new Date(1, 12, 1995);
//    yourBirth.month = 13;
//    yourBirth.setMonth(13);

    System.out.println("yourbirth is " + yourBirth.asText());

//    System.out.println("You birthday is on " + dayOfWeek(yourBirthDay, yourBirthMonth, myBirthYear));
    System.out.println("You birthday " +
        Date.asText(yourBirthDay, yourBirthMonth, yourBirthYear) +
        " is on " + Date.dayOfWeek(yourBirthDay, yourBirthMonth, yourBirthYear));

    System.out.println("My birthday " + Date.asText(myBirth) + " is on " + Date.dayOfWeek(myBirth));

    Date partyDate = myBirth.addDays(3);
    System.out.println("Party is three days later, on " + partyDate.asText());

    System.out.println("Day of my party is " + partyDate.getDay());

//    System.out.println("myBirth is " + myBirth.toString());
    System.out.println("myBirth is " + myBirth);

    // NO NO NO! Strings ARE NOT dates...
//    Date d1 = "Hello";
    // BUT Holidays are "special kinds" of dates. But they ARE Date...
    Date h = new Holiday(1, 1, 2021, "new year's day");
    System.out.println("the holiday is " + h.toString());
  }
}
