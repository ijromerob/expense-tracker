import java.time.LocalDate;
import java.util.Scanner;

// This parent class makes reference to money being moved
public abstract class Transfer {
  // initializes the description, amount, the local date when the instance was
  // created
  String description;
  float amount;
  LocalDate transferDate;

  // scanner reads the inputs from the terminal
  Scanner scanner = new Scanner(System.in);

  // validation makes sure that the inputs are valid
  Validation inputValidation = new Validation();

  // Constructor enters description and the amount being paid
  // This constructor will be used in the contructor of Restaurants and groceries
  public Transfer() {
    System.out.print("Please enter a description: ");
    String descriptionInput = scanner.nextLine();

    System.out.print("Please enter an amount: ");
    float amountInput = inputValidation.validateNumber(scanner.nextLine());

    this.description = descriptionInput;
    this.amount = amountInput;
    this.transferDate = LocalDate.now();
  }

  // This method will be defined in the child classes
  // it will change slightly in every child class.
  abstract void printTransaction();

}