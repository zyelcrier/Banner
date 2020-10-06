import java.lang.reflect.Array;
import java.util.*;

public class main {
  public static void main(String[] args) {
    ArrayList<simulatedData>  simulatedStudentData = createSimulatedData();
    System.out.println(simulatedStudentData.size());
  }

  private static ArrayList<simulatedData> createSimulatedData(){
    ArrayList<simulatedData> dataArray = new ArrayList<>();
    while(dataArray.size()<3325){
      dataArray.add(new simulatedData());
    }
    return dataArray;
  }
}
