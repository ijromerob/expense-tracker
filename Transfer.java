import java.time.LocalDate;
import java.util.Scanner;

public class Transfer {

  String description;
  float amount;
  LocalDate transferDate;
  Scanner scanner = new Scanner(System.in);
  Validation inputValidation = new Validation();

  // Constructor
  public Transfer() {
    System.out.print("Please enter a description: ");
    String descriptionInput = scanner.nextLine();

    System.out.print("Please enter an amount: ");
    float amountInput = inputValidation.validateNumber(scanner.nextLine());

    this.description = descriptionInput;
    this.amount = amountInput;
    this.transferDate = LocalDate.now();
  }

  void printTransaction() {
    System.out.println(transferDate + " Description: " + description + " Amount: " + amount);
  }

}