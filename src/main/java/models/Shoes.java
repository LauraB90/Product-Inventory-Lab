package models;

public class Shoes {

    private int id;
    private String name;
    private String brand;
    private String color;
    //private int size;

    public Shoes (int id, String name, String color, String brand, int size, float prize){

        this.id = id;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.qty = qty;
        this.price = price;

    }

    public float getPrize() {
        return prize;
    }

    public void setPrize(float prize) {
        this.prize = prize;
    }

    private float prize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /*public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }*/

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private int qty;
    private float price;

    public void setName(String name) {
        this.name = name;
    }
   public String getName() {
    return name;

    }




}
