package sample;

public class Cafe {
    private String type;

    private int size;

    private double price;


    private int quantity;

    private int DailyQuantity;

    public int getDailyQuantity(){
        return DailyQuantity;
    }
    public void setDailyQuantity(int DailyQuantity){
        this.DailyQuantity = DailyQuantity;
    }


    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public Cafe(){}

    public Cafe( String type, int size, double price){

        this.type = type;
        this.size = size;
        this.price = price;
    }


    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public String getType(){
      return type;
    }

    public void setType(String type){
        this.type = type;
    }

}
