public class Groceries extends Transfer {

  String retailer;

  public Groceries() {
    System.out.print("Please enter a retailer: ");
    String retailer = scanner.nextLine();
    this.retailer = retailer;
  }

  @Override
  void printTransaction() {
    System.out.println(transferDate + " Description: " + description + " Amount: " + amount + " retailer: "
        + this.retailer);
  }

}
