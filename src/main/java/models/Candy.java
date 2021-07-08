package models;

public class Candy {

    private int id;
    private String name;
    private String brand;
    private String kind;
    private int size;
    private int qty;
    private float price;

    public void setId(int id) {
        this.id = id;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    /*private String kind;
    private int size;
    private int qty;
    private float price;*/

    public Candy(int id, String name, String brand,
               String kind, int qty,float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.kind = kind;
        this.qty = qty;
        this.price = price;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }



    public String getKind(){
        return kind;
    }

    public int getQty(){
        return qty;
    }

    public float getPrice(){
        return price;
    }

    public int getId(){
        return id;
    }




   // Candy dulces = new Candy(); // (6, "Rockaleta", "Sonrics", "Lolli",10.5f, 10, 80.00f);
    //Candy sweetAdidas = new Candy (6, "Stan Smith", "Adidas", "Tennis", 10.5f, 10, 80.00f);
}
