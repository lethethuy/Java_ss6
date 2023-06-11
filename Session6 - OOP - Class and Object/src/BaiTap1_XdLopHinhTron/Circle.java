package BaiTap1_XdLopHinhTron;

import java.util.Scanner;

public class Circle {
    // Khai bao thuoc tinh
    int BanKinh;
    String MauSac;

    // Dinh nghia phuong thuc khoi tao 0 tham s0

    public Circle() {

    }

    ;

    // Dinh nghia nghia phuon thuc khoi tao co tham so
    public Circle(int BanKinh, String MauSac) {
        this.BanKinh = BanKinh;
        this.MauSac = MauSac;

    }

    public double ChuVi() {
        return this.BanKinh * 3.14 * 2;
    }

    public double DienTich() {
        return this.BanKinh * this.BanKinh;
    }

    public void inputData() {
        // khai bao 1 bien de luu tru
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap ban kinh cua hinh tron");
        int r = sc.nextInt();
        System.out.println("Hay nhap mau sac cua hinh tron");
        String mauSac = sc.nextLine();
    }

    public String DisPlay() {
        return "Ban Kinh cua hinh tron la: " + BanKinh + "\n" +
                "Mau sac cua hinh trong la: " + MauSac + "\n" +
                "Chu vi hinh tron la: " + ChuVi() + "\n" +
                "Dien tich cua hinh trong la: " + DienTich();

    }


}
