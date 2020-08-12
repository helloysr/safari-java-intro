package aggregates;

// questions
// what day of week?
// is this a leap year
// render as "pretty text"

public class Date {
  // "fields" (or "attributes") are automatically set to zero, unless you write other code...
  // private fields allow "encapsulation" that is, the object can:
  // a) Protect itself from ever being in a meaninless state
  //
  private int day;
  private int month;
  private int year;

  // IMPLICIT Date this!!!
  public int getDay() {
//    return this.day;
    return day; // this. prefix is optional in Java unless required to disambiguate
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  public void setDay(int day) {
    if (day < 1 || day > 31) throw new IllegalArgumentException("bad day!!");
    this.day = day;
  }

  public void setMonth(int month) {
    if (month < 1 || month > 12) throw new IllegalArgumentException("Bad month");
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public Date(int day, int month, int year) {
    if (day < 1 || day > 31 || month < 1 || month > 12) throw new IllegalArgumentException("Bad Date");
    this.day = day;
    this.month = month;
    this.year = year;
  }

  // Zeller's Congruence (see Wikipedia)
  // day of week 0 = Saturday
  public static int dayOfWeek(int day, int month, int year) {
    int m;
    int y;
    if (month < 3) {
      m = month + 12;
      y = year - 1;
    } else {
      m = month;
      y = year;
    }
    int dow = (day + (13 * (m + 1) / 5) + y + y / 4 - y / 100 + y / 400) % 7;
    return dow;
  }

  public static int dayOfWeek(Date d) {
    return /*Date.*/dayOfWeek(d.day, d.month, d.year);
  }

  public static boolean isLeap(int year) {
    return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
  }

  public static String asText(int day, int month, int year) {
    return "Date: day=" + day + " month=" + month + " year=" + year;
  }

  public static String asText(Date d) {
    return "Date: day=" + d.day + " month=" + d.month + " year=" + d.year;
  }
  public /*static*/ String asText(/*Date this*/) { // called "instance method"
    return "Date: day=" + this.day + " month=" + this.month + " year=" + this.year;
  }

  @Override
  public /*static*/ String toString(/*Date this*/) { // called "instance method"
    return "Date: day=" + this.day + " month=" + this.month + " year=" + this.year;
  }

//  public static void addDays(Date d, int days) {
//    d.day = d.day + days; // WHAT ABOUT END OF MONTH, YEAR!!!!
//  }
//  public static Date addDays(Date d, int days) {
//    return new Date(d.day + days, d.month, d.year); // WHAT ABOUT END OF MONTH, YEAR!!!!
//  }
  public /*static*/ Date addDays(/*Date this, */int days) {
    return new Date(this.day + days, this.month, this.year); // WHAT ABOUT END OF MONTH, YEAR!!!!
  }
}
