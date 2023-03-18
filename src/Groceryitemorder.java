public class Groceryitemorder {
    private String name;
    private int quantity;
    private double priceperunit;
    public Groceryitemorder(){

    }
    public Groceryitemorder(String name, double priceperunit){
        this.name=name;
        this.priceperunit=priceperunit;
    }
    public double getcost(){
        double cost = priceperunit * quantity;
        return cost;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }


}
