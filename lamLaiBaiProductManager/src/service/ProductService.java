package service;

import model.Product;

public class ProductService {
    // tạo ra 1 mảng mới có thể chứa 100 phần tử
    private Product[] listProduct = new Product[100]; // tất cả các phần tử đều null
    // tạo ra 1 biến đếm số phần tử trong mảng mới
    private int size = 0; // biến đếm số phần tử ở trong mảng

    public Product[] getListProduct() {
        return listProduct;
    }

    // create tạo mới
    public boolean create(Product product) {
        // nếu mảng lớn hơn 100 thì không cho thêm mới
        if (size > 100) {
            System.err.println("Không thể thêm mới sản phẩm");
            return false;
        }
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i] == null) {
                listProduct[i] = product;
                size++;
                break;
            }

        }
        return true;
    }

    // chỉnh sửa
    // đầu tiên cần tìm vị trí index trong listProduct
    public Product findById(int id) {
        for (Product element : listProduct) {
            if (element.getId() == id) {
                return element;
            }
        }
        return null;
    }

    // tiến hành chỉnh sửa ở vị trí index
    public void update(Product product) {
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].getId() == product.getId())
                listProduct[i] = product;
            break;
        }
    }

    public void delete(int id) {
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].getId() == id) {
                listProduct[i] = null;
                size--;
                break;
            }
        }
    }

    public int getSize() {
        return this.size;
    }

}



