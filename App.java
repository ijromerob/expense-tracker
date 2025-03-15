import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Validation inputValidation = new Validation();

    // enter description
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a description: ");
    String description = scanner.nextLine();

    System.out.print("Please enter an amount: ");
    float amount = inputValidation.validateNumber(scanner.nextLine());

    Transfer testAmount = new Transfer(description, amount);

    testAmount.printTransaction();
  }
}
