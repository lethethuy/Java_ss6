package BaiThucHanh3;

public class Main {
    public static void main(String[] args) {
        // Tạo 2 danh mục như sau
        Category dm1 = new Category(1, "Quan");
        Category dm2 = new Category(2,"Ao");

        // Tao san pham thuoc danh muc 1
        Product product1 = new Product(1,"quần âu",150000,dm1);
        Product product2 = new Product(2, "quan jean", 250000,dm1);

        // Tao san pham thoc danh muc 2
        Product product3  = new Product(3, "ao so mi", 1250000, dm2);
        Product product4 = new Product(4, "ao phong", 175000, dm2);

        // Hien thi

        System.out.println("Tat ca san pham ");
        product1.DisPlay();
        product2.DisPlay();
        product3.DisPlay();
        product4.DisPlay();
    }
}
