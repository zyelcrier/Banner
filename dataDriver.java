import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class dataDriver {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("How much Student data would you like to generate?");
    Integer numOfReqData = Integer.parseInt(kb.nextLine());
    saveSimulatedDataCSVfile("studentData.csv", numOfReqData);
    kb.close();

  }

  static void saveSimulatedDataCSVfile(String csvFileName, Integer numOfData) {
    String csvHeaders = "id, First Name, Last Name, gpa";
    try (PrintWriter pw = new PrintWriter(csvFileName)){
      pw.println(csvHeaders); // must write the headers before anything else
      for (int i = 0; i < numOfData; i++) {
        Student sd = new Student();
        pw.println(sd.toCSVstring());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
