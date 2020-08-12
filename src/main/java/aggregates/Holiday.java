package aggregates;

// Holiday "is a" date with extras / modification
public class Holiday extends Date {
  private String name;

  public Holiday(int day, int month, int year, String name) {
    super(day, month, year);
    this.name = name;
  }

  @Override
  public String toString() {
//    return "I'm a holiday " + this.getDay();
    return super.toString() + " which is a holiday called " + name;
  }
}
