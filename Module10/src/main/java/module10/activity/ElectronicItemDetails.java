package module10.activity;

import java.util.HashMap;

//Create ElectronicItemDetails class
public class ElectronicItemDetails {

    public static void main(String[] args) {
        //Create HashMap with String name and double price
        HashMap<String, Double> itemHashMap = new HashMap<>();
        itemHashMap.put("TV", 1599.99);
        itemHashMap.put("Refrigerator", 499.99);
        itemHashMap.put("Washing Machine", 399.99);
        itemHashMap.put("Laptop", 699.99);

        System.out.println("Price of TV is " + returnPriceOfItem(itemHashMap, "TV"));
        returnPriceOfItem(itemHashMap, "TV");
        }

        //Create a method
    public static double returnPriceOfItem (HashMap<String, Double> itemHashMap, String name) {
        return itemHashMap.get(name);

    }
}
