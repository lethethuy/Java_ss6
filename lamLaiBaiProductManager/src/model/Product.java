package model;

public class Product {
    //tao thuoc tinh property
    private int id;
    private String name;
    private double price;
    private String description;

    // khoi tao contructor
    public Product() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "[ID:"+id+"|Name:"+name+"|Price: "+ price+ "| Description :"+ description+"]";
    }
}
