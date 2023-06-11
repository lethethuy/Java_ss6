package BaiThucHanh1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //　tao  1 bien luu chu
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hay nhap vao width");
        double width = scanner.nextDouble();
        System.out.println("Hay nhap vao height");
        double height = scanner.nextDouble();

        // khoi tao object, doi tuong
        Rectangle rectangle = new Rectangle(width, height);

        // In ra
        System.out.println("Hinh chu nhat cua ban la \n"+rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());


    }
}
