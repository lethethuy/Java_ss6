package BaiThucHanh3;

public class Category {
    int categoryId;
    String categoryName;

    // Khoi tao contructor
    public Category() {

    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;

    }

    public void DisPlay() {
        System.out.println("CategoryId: " + categoryId + "\n" + "CategoryName: " + categoryName);
    }
}
