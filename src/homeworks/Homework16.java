package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework16 {
    public static void main(String[] args) {
        System.out.println("\n------------Task-1------------\n");

        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        System.out.println("\n------------Task-2------------\n");

        TreeMap<String,Integer> items = new TreeMap<>();
        items.put("Apple", 3);
        items.put("Mango", 1);

        double result = calculateTotalPrice(items);
        System.out.println("Total Price: $" + result);

        TreeMap<String,Integer> items2 = new TreeMap<>();
        items2.put("Apple", 2);
        items2.put("Pineapple", 1);
        items2.put("Orange", 3);

        double result2 = calculateTotalPrice(items2);
        System.out.println("Total Price: $" + result2);

        System.out.println("\n------------Task-3------------\n");

        TreeMap<String,Integer> items3 = new TreeMap<>();
        items3.put("Apple", 3);
        items3.put("Mango", 5);

        double result3 = calculateTotalPrice2(items3);
        System.out.println("Total Price: $" + result3);

        TreeMap<String,Integer> items4 = new TreeMap<>();
        items4.put("Apple", 4);
        items4.put("Mango", 8);
        items4.put("Orange", 3);

        double result4 = calculateTotalPrice2(items4);
        System.out.println("Total Price: $" + result4);


    }

    public static Map<Integer,String> parseData(String data){
        Map<Integer,String> result = new TreeMap<>();

        String pattern = "\\{(\\d+)\\}([^\\{]+)";

        // Create a regex matcher object
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(pattern).matcher(data);

        // Find and process each key-value pair
        while (matcher.find()) {
            int key = Integer.parseInt(matcher.group(1));
            String value = matcher.group(2);

            // Add the key-value pair to the result map
            result.put(key, value);
        }

        return result;
    }

    public static double calculateTotalPrice(Map<String,Integer > items){
        Map<String, Double> itemPrices = new HashMap<>();
        itemPrices.put("Apple", 2.00);
        itemPrices.put("Orange", 3.29);
        itemPrices.put("Mango", 4.99);
        itemPrices.put("Pineapple", 5.25);

        double totalPrice = 0.0;

        // Iterate over the items in the map
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String item = entry.getKey();
            int amount = entry.getValue();

            // Check if the item is valid and has a price defined
            if (itemPrices.containsKey(item)) {
                double price = itemPrices.get(item);
                totalPrice += price * amount;
            }
        }

        return totalPrice;
    }

    public static double calculateTotalPrice2(Map<String, Integer> items) {
        Map<String, Double> itemPrices = new HashMap<>();
        itemPrices.put("Apple", 2.00);
        itemPrices.put("Orange", 3.29);
        itemPrices.put("Mango", 4.99);
        itemPrices.put("Pineapple", 5.25);

        double totalPrice = 0.0;

        // Iterate over the items in the map
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String item = entry.getKey();
            int amount = entry.getValue();

            // Check if the item is valid and has a price defined
            if (itemPrices.containsKey(item)) {
                double price = itemPrices.get(item);

                // Apply discounts
                if (item.equals("Apple")) {
                    // Apply 50% discount for every second Apple
                    double appleDiscountedPrice = price;
                    if (amount > 1 && amount % 2 == 0) {
                        appleDiscountedPrice = price * 0.5;
                    }
                    totalPrice += appleDiscountedPrice * amount;
                } else if (item.equals("Mango")) {
                    // Apply "Buy 3,Get 1 Free" discount for Mango
                    int freeMangoCount = amount / 4;
                    int paidMangoCount = amount - freeMangoCount;
                    totalPrice += price * paidMangoCount;
                } else totalPrice += price * amount;
            }
        }

        return totalPrice;
    }
    /* How Belal did
    ///////////////////////////////TASK02
    public static double calculateTotalPrice1(HashMap<String, Integer> map) {
        double total = 0;

        for (String s : map.keySet()) {
            switch (s){
                case "Apple":{
                    total += map.get(s) * 2.00;
                    break;
                }
                case "Mango":{
                    total += map.get(s) * 4.99;
                    break;
                }
                case "Orange":{
                    total += map.get(s) * 3.29;
                    break;
                }
                case "Pineapple":{
                    total += map.get(s) * 5.25;
                    break;
                }
            }


        }
        return total;
    } */

}
