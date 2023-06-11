package BaiTap1_XdLopHinhTron;

import BaiThucHanh1.Rectangle;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // tao 1 bien luu tru
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hay nhap vao ban kinh cua hinh tron");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("Hay nhap vao mau sac cua hinh tron");
        String mauSac = scanner.nextLine();

        // Khoi tao doi tuong
        Circle circle = new Circle(r, mauSac);

        // In ra
        System.out.println("Hinh chu nhat cua ban la: " + circle.DisPlay());

    }
}
