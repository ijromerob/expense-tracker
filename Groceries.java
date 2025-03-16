public class Groceries extends Transfer {

  String retailer;

  // This constructor enters the retailer name and saves it in the class.
  public Groceries() {
    System.out.print("Please enter a retailer: ");
    String retailer = scanner.nextLine();
    this.retailer = retailer;
  }

  // in this method, prints in the terminal the details of the transactions
  @Override
  void printTransaction() {
    System.out.println(transferDate + " Description: " + description + " Amount: " + amount + " retailer: "
        + this.retailer);
  }

}
