import java.time.LocalDate;

public class Transfer{

  String description = "";
  float amount = 0.0F;
  LocalDate transferDate = LocalDate.now();

  // Constructor
  public Transfer(){

  }

  void printTransaction(){
    System.out.println("Description: " + description + " Amount: " + amount);
  }


}