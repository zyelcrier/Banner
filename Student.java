import java.util.*;

class Student {
  private int id;
  private float gpa;
  private String firstName;
  private String lastName;

  int GPA_MAX = 4;
  int ID_MIN = 900_000;
  int ID_MAX = 999_999;
  String[] FIRST = { "Jamie", "Phil", "Cathy", "Jack", "Jen", "Tanner", "David", "Carter", "Molly", "Emily", "Roger",
      "Tony", "Abby", "Davin", "Chris", "Thomas" };
  String[] LAST = { "Barch", "Wong", "Brown", "Joestar", "Mcarthy", "clint", "foster", "Zuko", "Winehouse", "Green",
      "Rose", "Walter", "Rose-Wall" };

  public Student() {
    Random rand = new Random();

    this.firstName = FIRST[rand.nextInt(FIRST.length)];
    this.lastName = LAST[rand.nextInt(LAST.length)];

    // TODO What can we do to generate a float in range? Here's an algorithm:
    // use rand.nextFloat() then add a random int to it.
    // Java makes us work way too hard for this common task!
    this.gpa = rand.nextFloat() + rand.nextInt(GPA_MAX);

    this.id = rand.nextInt((ID_MAX - ID_MIN) + 1) + ID_MIN;
  }

  public Student(String dataLine) {
    String dataParts[] = dataLine.split(",");
    this.id = Integer.parseInt(dataParts[0]);
    this.firstName = dataParts[1];
    this.lastName = dataParts[2];
    this.gpa = Float.parseFloat(dataParts[3]);
  }

  @Override
  public String toString() {
    return String.format("%d,%s,%s,%f,", id, firstName, lastName, gpa);
  }

}