import java.util.ArrayList;

public class Main {
    public static <list> void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(3);
            list.add(0);
            list.add(2);
       System.out.println(getMax(list));
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        sort(list);
        list.forEach(name->{
            System.out.println(name);
        });




    }
    public static Integer  getMax(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }

    public static void sort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (list.get(j) > list.get(j+1)) {
                    // Swap the two elements if they're in the wrong order
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }



}