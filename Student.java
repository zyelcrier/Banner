import java.util.*;

class Student {
  private int iD;  // TODO  Fix the case since the convention for variables is camelCase.
  private float gpa;
  private String firstName;
  private String lastName;

  @Override
  public String toString() {
    return "firstName\tlastName\t id \t gpa";
  }

  // TODO  The convention is to position constructors before every other method.
  public Student() {
    Random rand = new Random();
    float gpaMax = (float) 4.0;

    // TODO These are class constants, move them to Line 8.
    // The convention is that CONSTANTS should be all caps.
    // TODO  Java let's you put underscores in numbers to make them easier to read.
    //    int ID_MIN = 900_000;  // BTW Java doesn't enforce the position of underscores, 9_00_0000
    Integer idMin = 900000;
    Integer idMax = 999999;

    // TODO These are class constants.
    String[] first = { "Jamie", "Phil", "Cathy", "Jack", "Jen", "Tanner", "David", "Carter", "Molly", "Emily", "Roger",
        "Tony", "Abby" };
    String[] last = { "Barch", "Wong", "Brown", "Joestar", "Mcarthy", "clint", "foster", "Zuko", "Winehouse", "Green",
        "Rose", "Walter" };
    
    this.firstName = first[rand.nextInt(first.length)];
    this.lastName = last[rand.nextInt(last.length)];

    // TODO If this calculation, no one will have a 4.0 gpa.  Why?
    // Google "javadocs 13 random nextfloat",
    // click the Oracle link, then click nextfloat to see [0..GPA_MAX), inclusive-exclusive.

    // TODO What can we do to generate a float in range?  Here's an algorithm:
    // use rand.nextFloat() then add a random int to it.
    // Java makes us work way too hard for this common task!
    this.gpa = rand.nextFloat() * gpaMax;

    this.iD = rand.nextInt((idMax - idMin) + 1) + idMin;
  }

  public String toCSVstring() {
    return String.format("%d,%s,%s,%f,", iD, firstName, lastName, gpa);
  }

}