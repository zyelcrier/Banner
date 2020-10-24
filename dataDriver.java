import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

// TODO The conventions are to use TitleCase for class names,
// use camelCase for variables, and
// use ALL_CAPS for constants.
public class dataDriver {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    // TODO I shouldn't have to type a value when the problem statement says 3325 students.
    System.out.println("How much Student data would you like to generate?");

    // TODO  Scanner is smart enough to read an int without you having to read it as a String.
    // TODO Don't use Integer when int will do.  Google "Java box an integer" and read about autoboxing.
    // Try  int numOfReqData = kb.nextInt();
    Integer numOfReqData = Integer.parseInt(kb.nextLine());

    saveSimulatedDataCSVfile("studentData.csv", numOfReqData);
    kb.close();

  }

  // TODO  Use whitespace (empty lines, tabs, spacing) to group logical blocks of code.
  // TODO  Don't use the class Integer when an int will do.
  static void saveSimulatedDataCSVfile(String csvFileName, Integer numOfData) {
    String csvHeaders = "id, First Name, Last Name, gpa";

    try (PrintWriter pw = new PrintWriter(csvFileName)){

      // TODO  NO!!!!  Don't do things the problem statement doesn't require.
      // By putting this header in our team's data file, you'll break other's code
      pw.println(csvHeaders); // must write the headers before anything else

      for (int i = 0; i < numOfData; i++) {
        Student sd = new Student();

        // TODO  Odd, why don't you just use
        // pw.println(sd);
        pw.println(sd.toCSVstring());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
