import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class main {
  // TODO csvHeaders is only used in saveSimulatedInfoCSVfile so it shouldn't be a class variable.
  static String csvHeaders = "id, name, gpa";
  public static void main(String[] args) {

    // TODO This function doesn't pass the "smell test".  Something seems wrong about it.
    // It's called "createSimulatedDate" but doesn't require anything from the caller.
    // How does the function know how many records of data the user wants?
    // What's really odd is you have a "simulatedData" class but this is a function not a method.
    // Shouldn't a simulatedData object know how to create simulated date? 
    ArrayList<simulatedData>  simulatedStudentData = createSimulatedData();
    System.out.println(simulatedStudentData.size());

    // TODO This is odd.  Why do users create an ArrayList of simulatedData
    // then write that data to a file.  Isn't it the other way around?
    // The file has a bunch of data that is sometimes read into an ArrayList.
    saveSimulatedInfoCSVfile("studentData.csv", simulatedStudentData);

    
  }

  // TODO Odd, you have a class that does stuff with simulate data but this is a function not a method.
  static void saveSimulatedInfoCSVfile(String csvFileName, ArrayList<simulatedData> simulatedStudentData) {

    // TODO Use try-with-resources.
    // https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
    try {
        PrintWriter pw = new PrintWriter(csvFileName);
        System.out.println("Saving records");  // TODO Don't write your output/debugging messages in code that others use.
        pw.println(csvHeaders); // must write the headers before anything else
        for (simulatedData SD : simulatedStudentData) {
            pw.println(SD.toCSVstring());
        }
        pw.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    System.out.println("Records Saved");  // TODO Remove your output/debugging messages.
}

  // TODO Odd, you have a class that does stuff with simulate data but this is a function not a method.
  private static ArrayList<simulatedData> createSimulatedData(){
    ArrayList<simulatedData> dataArray = new ArrayList<>();

    // TODO Don't use magic numbers.
    while(dataArray.size()<3325){  // Java let's you write number literals with _ for readability.  3_325
      dataArray.add(new simulatedData());
    }
    return dataArray;
  }
}
