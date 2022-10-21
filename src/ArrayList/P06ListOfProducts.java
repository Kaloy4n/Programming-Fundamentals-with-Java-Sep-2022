package ArrayList;

import java.util.*;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        
        List<String> productsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String product = sc.nextLine();
            productsList.add(product);

        }
        Collections.sort(productsList);
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println(i + 1 + "." + productsList.get(i));
        }
    }
}
