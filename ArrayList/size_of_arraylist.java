package ArrayList;

import java.util.ArrayList;

public class size_of_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Size of arraylist is: "+ list.size());

        // print the arraylist element by iterating by loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
}
