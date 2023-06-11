package BaiThucHanh2;

public class Student {
    // Khoi tao doi tuong
    int studentId;
    String studentName;
    boolean sex;
    String className;
    int age;
    String address;

    // Phuong thuc khoi tao 0 tham so
    public Student() {

    }

    // phuong thuc khoi tao 6 tham so
    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Msv: " + studentId + "\n"
                + "Ten SV: " + studentName + "\n"
                + "Ten class" + className + "\n"
                + "Tuoi: " + age + "\n"
                + "Gioi tinh: " + (sex?"Nam":"Nu") + "\n"
                + "Address: " + address
        );
    }

}
