public class Groceries extends Transfer {

  String retailer;

  public Groceries(String retailer, String description, float amount) {
    super(description, amount);
    this.retailer = retailer;
  }

  void printCostTransaction() {
    super.printTransaction();
    System.out.println("Type: " + this.type);
  }

}
