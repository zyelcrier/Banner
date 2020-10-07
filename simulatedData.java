import java.util.*;

// TODO The convention is that class names are in TitleCase not camelCase.

// TODO What an odd name for a class.  If a class is named String, I assume it holds characters and does String-like stuff.
// I can't imagine what a "simulatedData" object holds or what operations are simulatedData-like.
// Every class must have a single purpose.  The String class does String stuff.  What's the purpose for simulatedData?
class simulatedData {
  private int ID; // TODO The convention is that variables are camelCase, ClassNames in TitleCase, and CONSTANTS all caps.
  private Double gpa; // TODO Don't use Double use double.  Google "Java box and unbox".
  private String name;
  private Random rand = new Random();  // TODO why is this a class variable?

  // TODO You'll get more interesting names if you randomly build the name from a list of first names + list of last names.
  // Also, this better models the human world and it's helpful when code models our human expectations.
  // Why is this a class variable?
  private String[] NAMES = { 
    "Oliva Barch", "Amy Wong", "Timothy Brown", 
    "Jo Joestar", "Damion Mcarthy", "Greg foster",
    "Tina Turner", "Amy Winehouse", "Oliver Green",
    "Danny Zuko" };

  // TODO This should have an @Override annotation to help the compiler.
  // TODO Nope, don't decide for your users the labels of the output.
  // "name \t id \t gpa"
  public String toString(){
    return name+", Student: "+ID+" G.P.A: "+gpa;
  }

  // TODO You're using the word "simulated" when I think you mean "generate".
  // This method generates a row of data, a record.
  public simulatedData(){
    this.name = NAMES[rand.nextInt(NAMES.length)];

    // TODO Don't use "magic numbers".  Magic numbers are literal numbers (like 5, 10, 9000) that just magically appear.
    // Use CONSTANTS.
    Double gpa = Double.parseDouble(rand.nextInt(5)+"."+rand.nextInt(10));
    
    // TODO  Yuck.  You're generating this gpa.  If you don't want a gpa > 4 then just don't generate a gpa > 4.
    while(gpa>4.0){
      gpa = Double.parseDouble(rand.nextInt(5)+"."+rand.nextInt(10));
    }
    this.gpa = gpa;  // TODO Odd, why do you need a local variable?

    // TODO  Yuck.  Java knows how to generate random integers, why generate individual digits?
    // Don't let your code wrap.  Keep lines around 80 characters.
    this.ID = Integer.parseInt("900" + rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10));
  }

  // TODO Don't write methods until you need them.
  // More importantly, don't write methods that you haven't tested for correctness.
  // YAGNI == "You ain't gonna need it"

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