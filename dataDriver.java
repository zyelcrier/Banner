import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DataDriver {

  public static void main(String[] args) {
    int NUM_OF_DATA = 3325;
    saveSimulatedDataCSVfile("studentData.csv", NUM_OF_DATA);

  }

  // TODO  Use whitespace (empty lines, tabs, spacing) to group logical blocks of code.
  static void saveSimulatedDataCSVfile(String csvFileName, int numOfData) {

    try (PrintWriter pw = new PrintWriter(csvFileName)){

      for (int i = 0; i < numOfData; i++) {
        Student sd = new Student();
        pw.println(sd);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
