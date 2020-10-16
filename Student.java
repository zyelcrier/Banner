import java.util.*;

class Student {
  private int iD;
  private float gpa;
  private String firstName;
  private String lastName;

  @Override
  public String toString() {
    return "firstName\tlastName\t id \t gpa";
  }

  public Student() {
    Random rand = new Random();
    float gpaMax = (float) 4.0;
    Integer idMin = 900000;
    Integer idMax = 999999;

    String[] first = { "Jamie", "Phil", "Cathy", "Jack", "Jen", "Tanner", "David", "Carter", "Molly", "Emily", "Roger",
        "Tony", "Abby" };
    String[] last = { "Barch", "Wong", "Brown", "Joestar", "Mcarthy", "clint", "foster", "Zuko", "Winehouse", "Green",
        "Rose", "Walter" };
    this.firstName = first[rand.nextInt(first.length)];
    this.lastName = last[rand.nextInt(last.length)];

    this.gpa = rand.nextFloat() * gpaMax;

    this.iD = rand.nextInt((idMax - idMin) + 1) + idMin;
  }

  public String toCSVstring() {
    return String.format("%d,%s,%s,%f,", iD, firstName, lastName, gpa);
  }

}