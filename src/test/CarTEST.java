package test;

import java.io.Serializable;

public class CarTEST implements Serializable{


    static final long serialVersionUID = 10000L;
    private String brand;
    private int price;
    private transient String sales;
    private transient String idk;
    private transient int k;

    @Override
    public String toString() {
        return "CarTEST{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", sales='" + sales + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public CarTEST(String brand, int price, String sales) {
        this.brand = brand;
        this.price = price;
        this.sales = sales;
    }
}
