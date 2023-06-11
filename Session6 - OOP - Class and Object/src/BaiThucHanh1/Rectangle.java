package BaiThucHanh1;

public class Rectangle {
    // Khai bao object(đối tượng)\
    double width, height;

    // khai báo contructor
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;

    }

    // khai bao method (Phuong thuc)

    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }


    public String display() {
        return "Rectangle{"+" width" + width + " height"+ height + "}" ;
    }
}
