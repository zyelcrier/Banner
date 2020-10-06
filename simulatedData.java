import java.util.*;
class simulatedData {
  private int ID;
  private Double gpa;
  private String name;
  private Random rand = new Random();

  private String[] NAMES = { 
    "Oliva Barch", "Amy Wong", "Timothy Brown", 
    "Jo Joestar", "Damion Mcarthy", "Greg foster",
    "Tina Turner", "Amy Winehouse", "Oliver Green",
    "Danny Zuko" };

  public String toString(){
    return name+", Student: "+ID+" G.P.A: "+gpa;
  }

  public simulatedData(){
    this.name = NAMES[rand.nextInt(NAMES.length)];
    Double gpa = Double.parseDouble(rand.nextInt(5)+"."+rand.nextInt(10));
    while(gpa>4.0){
      gpa = Double.parseDouble(rand.nextInt(5)+"."+rand.nextInt(10));
    }
    this.gpa = gpa;
    this.ID = Integer.parseInt("900" + rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10));
  }

  public int getID(){
    return this.ID;
  }

  public Double getGPA(){
    return this.gpa;
  }

  public String getName(){
    return this.name;
  }

  public String toCSVstring() {
    return String.format("%d,%s,%f,",
            ID, name, gpa);
}
}