import config.Config;
import controller.ProductController;
import model.Product;

public class Main {
    static ProductController productController = new ProductController();

    public static void main(String[] args) {

        int choice;
        while (true) {
            System.out.println("===========Menu============");
            System.out.println("1. Hiển thị toàn bộ sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.println("Hãy nhập vào lựa chọn của bạn ");
            choice = Config.scanner().nextInt();
            switch (choice) {
                case 1:
                    // Hiển thị danh sách
                    displayListProduct();
                    break;
                case 2:
                    creatNewProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Thoát chương trình ");
                    System.exit(0);
                default:
                    System.err.println("Hãy nhập 1 số từ 1 đến 5");

            }
        }

    }

    public static void displayListProduct() {
        // Lấy ra danh sách sản phẩm

        if (productController.getSize() == 0) {
            System.err.println("Danh sách sản phẩm trống");
            return;
        }
        Product[] list = productController.getAll();
        System.out.println("Danh sách sản phẩm");
        for (Product p :
                list) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public static void deleteProduct() {
        System.out.println("Hãy nhập vào thằng id cần xóa");
        int id = Config.scanner().nextInt();
        productController.delete(id);

    }

    public static void updateProduct() {
        System.out.println("Nhập vào thằng id cần update");
        int Id = Config.scanner().nextInt();
        Product product = productController.findById(Id);
        if(product != null){
            System.out.println(product);
            System.out.println("Id= "+ Id);
            System.out.println(" Nhap vao ten moi: ");
            product.setName(Config.scanner().nextLine());
            System.out.println(" Nhap vao gia: ");
            product.setPrice(Config.scanner().nextDouble());
            System.out.println("Nhap vao mo ta moi");
            product.setDescription(Config.scanner().nextLine());
            productController.update(product);
        }else System.out.println("Khong tim thay san pham do");

    }

    public static void creatNewProduct() {
        Product newProduct = new Product();
        int id = getNewId();
        newProduct.setId(getNewId());
        System.out.println("Id = " + id);
        System.out.println("Nhập vào tên: ");
        newProduct.setName(Config.scanner().nextLine());
        System.out.println("Nhập vào giá: ");
        newProduct.setPrice(Config.scanner().nextDouble());
        System.out.println("Nhập vào mô tả");
        newProduct.setDescription(Config.scanner().nextLine());
        boolean check = productController.createProduct(newProduct);
        if (check) {
            System.out.println("Thêm mới thành công");

        }

    }

    public static int getNewId() {
        Product[] list = productController.getAll();
        int idMax = 0;
        for (Product p :
                list) {
            if (p == null) {
                continue;
            }
            if (idMax < p.getId()) {
                idMax = p.getId();
            }
        }
        return idMax + 1;
    }


}

