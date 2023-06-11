package config;

public class Validate {
    public static boolean checkProductName(String productName){
        // ten san pham phai it nhat co 6 ki tu va bat dau bang chu P;
        if(productName.length()<6){
            System.err.println("Ten cua san pham phai bat dau bang chu P va co it nhat 6 ki tu");
            return false;
        }
        return true;
    }
    public static boolean checkProductPrice(double price){
        if (price<=0){
            return false;
        }
        return true;
    }
}
