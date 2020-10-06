import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class main {
  static String csvHeaders = "id, name, gpa";
  public static void main(String[] args) {
    ArrayList<simulatedData>  simulatedStudentData = createSimulatedData();
    System.out.println(simulatedStudentData.size());
    saveSimulatedInfoCSVfile("studentData.csv", simulatedStudentData);

    
  }

  static void saveSimulatedInfoCSVfile(String csvFileName, ArrayList<simulatedData> simulatedStudentData) {
    try {
        PrintWriter pw = new PrintWriter(csvFileName);
        System.out.println("Saving records");
        pw.println(csvHeaders); // must write the headers before anything else
        for (simulatedData SD : simulatedStudentData) {
            pw.println(SD.toCSVstring());
        }
        pw.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    System.out.println("Records Saved");
}

  private static ArrayList<simulatedData> createSimulatedData(){
    ArrayList<simulatedData> dataArray = new ArrayList<>();
    while(dataArray.size()<3325){
      dataArray.add(new simulatedData());
    }
    return dataArray;
  }
}
