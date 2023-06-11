package BaiThucHanh3;

public class Product {
    // Khoi tao doi tuong Object
    int productId;
    String productName;
    double productPrice;
    Category category;

    // Khoi tao contructor khong tham so
    public Product() {

    }

    // Khoi tao contructor co 4 tham so
    public Product(int productId, String productName, double productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public void DisPlay() {
        System.out.println("ProductId: " + productId + "\n" + "ProductName: " + productName + "\n" + "ProductPrice: " + productPrice + "\n" + "category " + category);
    }

}
