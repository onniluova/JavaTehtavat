package src.Mooduli2.tehtavisto2.tehtava2_1;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager1 {
    HashMap<String, HashMap<String, String>> groceryTypes = new HashMap<>();
    HashMap<String, Double> groceryDetails = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryDetails.put(item, cost);
        System.out.println(item + " lisätty ostoslistaan.");
    }

    public void removeItem(String item) {
        if (groceryDetails.remove(item) != null) {
            System.out.println(item + " poistettu listasta.");
        } else {
            System.out.println(item + " ei löytynyt listasta.");
        }
    }

    public void displayList() {
        System.out.println("Listassa on: ");
        for (Map.Entry<String, Double> entry : groceryDetails.entrySet()) {
            System.out.println(entry.getKey() + " - hinta: " + entry.getValue());
        }
    }

    public boolean checkItem(String item) {
        if (groceryDetails.containsKey(item)) {
            System.out.println("Tuote löytyi listasta.");
            return true;
        } else {
            System.out.println("Tuotetta ei löytynyt listasta.");
            return false;
        }
    }

    //public void calculateCost() {
    //    double totalCost = 0;
    //    for (Double cost : groceryDetails.values()) {
    //        totalCost += cost;
    //    }
    //    System.out.println("Kokonaiskustannus: " + totalCost);
    //}

    //public void addItemWithCategory(String item, String category, double cost, String propertyValue) {
    //    groceryDetails.putIfAbsent(item, cost);
    //    groceryTypes.putIfAbsent(category, new HashMap<>());
    //    groceryTypes.get(category).put(item, propertyValue);
    //}

    public static void main(String[] args) {
        GroceryListManager1 list = new GroceryListManager1();
        list.addItem("Milk", 1.50);
        list.addItem("Bread", 2);
        list.addItem("Butter", 2.5);
        list.displayList();
        list.removeItem("Bread");
        list.displayList();
        list.checkItem("Milk");
        list.checkItem("Eggs");
        //list.calculateCost();
    }
}