import java.time.LocalDate;

public class Transfer{

  String description;
  float amount;
  LocalDate transferDate;

  // Constructor
  public Transfer(String descriptionInput, float amountInput){
    this.description = descriptionInput;
    this.amount = amountInput;
    this.transferDate = LocalDate.now();
  }

  void printTransaction(){
    System.out.println(transferDate + " Description: " + description + " Amount: " + amount);
  }


}