import java.util.ArrayList;

public class TransfersManager {
  ArrayList<Groceries> groceries = new ArrayList<>();
  ArrayList<Restaurants> restaurants = new ArrayList<>();;
  Validation inputValidation = new Validation();

  void addRestaurants() {
    Restaurants newRestaurant = new Restaurants();
    restaurants.add(newRestaurant);
    System.out.println("your restaurant expense has been added");

  }

  void addGroceries() {
    Groceries newGrocery = new Groceries();
    groceries.add(newGrocery);
    System.out.println("your groceries expense has been added");
  }

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
