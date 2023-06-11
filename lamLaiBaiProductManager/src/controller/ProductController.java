package controller;

import model.Product;
import service.ProductService;

public class ProductController {
    // Khởi tạo đối tượng
     private ProductService productService = new ProductService();


     // lấy các phương thức đã tạo từ thằng ProducService sang
     public Product[] getAll(){
         return productService.getListProduct();
     }

     // create tạo sản phẩm mới
    public boolean createProduct (Product p){
         return productService.create(p);

    }

    // Tìm id

    public Product findById(int id){
         return productService.findById(id);
    }

    public void update(Product p){
         productService.update(p);
    }

    public void delete(int id){
         productService.delete(id);
    }

    public int getSize(){
      return productService.getSize();
    }

}
