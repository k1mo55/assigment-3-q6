public class Main {
    public static void main(String[] args) {
        GroceryList list = new GroceryList();
        Groceryitemorder order1 = new Groceryitemorder("biscuits",2.5);
        order1.setQuantity(4);
        list.addGroceryList(order1);
        Groceryitemorder order2 = new Groceryitemorder("biscuits",2.5);
        order2.setQuantity(3);
        list.addGroceryList(order2);
       System.out.println(list.gettotalcost());
        

    }
}