import java.util.Scanner;

public class App {

  public static void main (String[] args){
    



// enter description
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a description: ");
    String description = scanner.nextLine();

    System.out.print("Please enter an amount: ");
    float amount = Float.parseFloat(scanner.nextLine());

    Transfer testAmount = new Transfer(description, amount);

    testAmount.printTransaction();
  }
}


// Money Movement parent class
// Type, Concept, Amount, (system date)
// expenses and costs


// Class for error handling