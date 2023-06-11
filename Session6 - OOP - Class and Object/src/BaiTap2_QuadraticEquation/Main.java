package BaiTap2_QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khoi tao một nơi để lưu trữ dữ liệu
        Scanner sc = new Scanner(System.in);

        System.out.println("Hay nhap gia tri cua a");
        double a = sc.nextDouble();
        System.out.println("Hay nhap gia tri cua b");
        double b = sc.nextDouble();
        System.out.println("Hay nhap gia tri cua c");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscrimimant() > 0) {
            System.out.println("Nghiem 1 la: " + quadraticEquation.getRoot1() + "\n" + "Nghiem 2 la: " + quadraticEquation.getRoot2());
        }
        if (quadraticEquation.getDiscrimimant() == 0) {
            System.out.println("Phuong tirnh co 1 nghiem duy nhat: " + quadraticEquation.getRoot3());

        } else {
            System.out.println("The equation has no roots");
        }


    }
}
