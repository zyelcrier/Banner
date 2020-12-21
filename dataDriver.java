import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;

public class DataDriver {
  static int NUM_OF_DATA = 3325;

  public static void main(String[] args) {
    String csvFileName = "studentData.csv";
    saveSimulatedDataCSVfile(csvFileName, NUM_OF_DATA);

    String[] studentNames = getStudentNamesFromFile(csvFileName);

    ArrayList<String> studentNamesAL = convertFromPrimToALSort(studentNames);

    ArrayList<Student> students = getAllStudentsFromFile(csvFileName);

  }

  // Generating Simulated Data
  static void saveSimulatedDataCSVfile(String csvFileName, int numOfData) {

    try (PrintWriter pw = new PrintWriter(csvFileName)) {

      for (int i = 0; i < numOfData; i++) {
        Student sd = new Student();
        pw.println(sd);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  // Primitive Arrays and Arraylists

  // part a
  static String[] getStudentNamesFromFile(String csvFileName) {
    String[] names = new String[NUM_OF_DATA];
    File studentFile = new File(csvFileName);
    try {
      Scanner dataScan = new Scanner(studentFile);
      int counter = 0;
      while (dataScan.hasNext()) {
        String data = dataScan.nextLine();
        String dataParts[] = data.split(",");
        String name = dataParts[1] + " " + dataParts[2];
        names[counter] = name;
        counter++;
      }
      dataScan.close();
    } catch (FileNotFoundException e) {
      System.err.printf("Cannot open file: [%s].\nExiting program.", csvFileName);
      System.exit(0);
    }
    return names;
  }

  // part c
  static ArrayList<String> convertFromPrimToALSort(String[] studentNames) {
    ArrayList<String> namesArrayList = new ArrayList<>();
    for (String name : studentNames) {
      namesArrayList.add(name);
    }
    Collections.sort(namesArrayList);
    return namesArrayList;

  }

  // part e&f
  static ArrayList<Student> getAllStudentsFromFile(String csvFile) {
    ArrayList<Student> students = new ArrayList<>();
    File studentFile = new File(csvFile);
    try {
      Scanner dataScan = new Scanner(studentFile);
      while (dataScan.hasNext()) {
        String data = dataScan.nextLine();
        Student s = new Student(data);
        students.add(s);
      }
      dataScan.close();
    } catch (FileNotFoundException e) {
      System.err.printf("Cannot open file: [%s].\nExiting program.", csvFile);
      System.exit(0);
    }
    return students;
  }
}
