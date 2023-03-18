import java.util.ArrayList;

public class GroceryList {
    ArrayList<Groceryitemorder> list =new ArrayList<>();
    private int size=0 ;
    public GroceryList(){

    }
    public void addGroceryList(Groceryitemorder x){
        if(size<10){
           list.add(x);
       }
       else
           System.out.println("you cant put more items");
    }

    public double  gettotalcost(){
        double sum =0;
        for (int i = 0; i < list.size(); i++){

            sum=sum+list.get(i).getcost();
        }
        return sum ;

    }

    }


