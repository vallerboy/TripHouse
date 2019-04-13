package gradmother;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String products = "jabłka:30:1.20/dynia:1:11/masło:1:6/dynia:2:22/kartki swiateczne:1:20/piernik:20:2/pepsi:1:6/masło:2:6/mleko:1:3/ser:2:4";
        List<Product> productsList = new ArrayList<>();

        for (String s : products.split("/")) {
             String[] oneStringProduct = s.split(":");

             productsList.add(new Product(oneStringProduct[0],
                                          Integer.valueOf(oneStringProduct[1]),
                                            Double.valueOf(oneStringProduct[2])));
        }


        //Max price
        Product actualMax = productsList.get(0);
        for (Product product : productsList) {
            if(actualMax.getPrice() < product.getPrice()){
                actualMax = product;
            }
        }

        System.out.println(actualMax.getName());
    }
}
