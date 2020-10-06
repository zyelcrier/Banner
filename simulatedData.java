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
    this.gpa = Double.parseDouble(rand.nextInt(5)+"."+rand.nextInt(10));
    this.ID = Integer.parseInt("900" + rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10));
  }
}