import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    // This instance will validate numbers as positive numeric inputs
    Validation inputValidation = new Validation();

    // this instance will manage what the user wants to do
    TransfersManager manager = new TransfersManager();

    // scanner reads the inputs from the terminal
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to your expense tracker!");
    while (true) {
      System.out.println("Please enter one of the following options");
      System.out.println("1. Add a grocery ");
      System.out.println("2. Add restaurants");
      System.out.println("3. Print all");
      System.out.println("4. Quit");

      System.out.print("Please enter your choice: ");
      float option = inputValidation.validateNumber(scanner.nextLine());
      if (option == 1) {
        manager.addGroceries();
      } else if (option == 2) {
        manager.addRestaurants();
      } else if (option == 3) {
        manager.printAll();
      } else if (option == 4) {
        break;
      } else {
        System.out.println("this option does not is not in the menu");
        continue;
      }

    }
    System.out.println("thanks for using the expense tracker!");
  }
}
