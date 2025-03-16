import java.util.ArrayList;

public class TransfersManager {
  // The class will create lists of instances of groceries and restaurants
  ArrayList<Groceries> groceries = new ArrayList<>();
  ArrayList<Restaurants> restaurants = new ArrayList<>();

  // a validation instance will be needed to make sure amounts are correct
  Validation inputValidation = new Validation();

  // This method creates an instance of a restaurant and adds it to the restaurant
  // ArrayList
  void addRestaurants() {
    Restaurants newRestaurant = new Restaurants();
    restaurants.add(newRestaurant);
    System.out.println("your restaurant expense has been added");

  }

  // This method creates an instance of a groceries and adds it to the restaurant
  // ArrayList

  void addGroceries() {
    Groceries newGrocery = new Groceries();
    groceries.add(newGrocery);
    System.out.println("your groceries expense has been added");
  }

  // This method prints all the groceries in the groceries list and all the
  // restaurant expenses into the terminal
  void printAll() {
    System.out.println("GROCERIES");
    if (groceries.size() == 0) {
      System.out.println("there are no groceries expenses");
    } else {
      for (Groceries g : groceries) {
        g.printTransaction();
      }
    }

    System.out.println("RESTAURANTS");
    if (groceries.size() == 0) {
      System.out.println("there are no restaurant expenses");
    } else {
      for (Restaurants r : restaurants) {
        r.printTransaction();
      }
    }
  }
}
