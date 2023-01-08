package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // product -> totalCost (qty * single price)
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while(!input.equals("buy")) {
            //"Beer 2.20 100"
            String product = input.split(" ")[0];
            double pricePerProduct = Double.parseDouble(input.split(" ")[1]);
            int qty = Integer.parseInt(input.split(" ")[2]);

            productPrice.put(product, pricePerProduct);

            if(!productQuantity.containsKey(product)) {
                productQuantity.put(product, qty);
            } else {
                productQuantity.put(product, productQuantity.get(product) + qty);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productPrice.entrySet()) {
            //key (name of product) -> value (price)
            // price * qty
            String productName = entry.getKey();
            double totalCost = entry.getValue() * productQuantity.get(entry.getKey());
            System.out.printf("%s -> %.2f%n", productName, totalCost);
        }
        //productPrice.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));
    }
}
