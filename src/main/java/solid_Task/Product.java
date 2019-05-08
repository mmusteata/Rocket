package solid_Task;


import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String>  productList;
    private ProductEnum productEnum;

    public Product(List<String>  productList) {
        this.productList = productList;
        getProductName(productList);
    }

    public void getProductName(List<String> productId){
        List<String> productNames = new ArrayList<>();
        for (int i=0; i<productId.size();i++){
            if (i == ProductEnum.){
                productNames. add(productEnum.getPRODUCT());
            } else
                try {
                    throw new Exception("No products with this ID");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
        for (int i=0; i<productNames.size();i++){
            System.out.println(productNames.get(i));
        }
    }
}
