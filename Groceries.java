public class Groceries extends Transfer {

  String retailer;

  public Groceries() {
    System.out.print("Please enter a retailer: ");
    String retailer = scanner.nextLine();
    this.retailer = retailer;
  }

  void printCostTransaction() {
    super.printTransaction();
    System.out.println("retailer: " + this.retailer);
  }

}
