package BaiThucHanh2;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng từ lớp Student bằng phương thức khởi tạo 6 tham số
        Student student1 = new Student(1, "Nguyen Van A",true,"Jv-01",19,"Ha Noi");
        Student student2 = new Student(2, "Nguyen Van b",true,"Jv-02",19,"Ha Noi");
        Student student3 = new Student(3, "Nguyen Van c",true,"Jv-03",19,"Ha Noi");

       // Hiển thị tất cả các thong tin của đối tượng bằng phương thức display()
        System.out.println("----------------Thôn tin của student1---------------");
        student1.display();
        System.out.println("----------------Thôn tin của student2---------------");
        student2.display();
        System.out.println("----------------Thôn tin của student3---------------");
        student3.display();
    }
}
