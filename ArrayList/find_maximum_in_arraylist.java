package ArrayList;

import java.util.ArrayList;

public class find_maximum_in_arraylist {
    public static void main(String[] args) {
          ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(3);

        int max= Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            // if(max < list.get(i)){
            //     max= list.get(i);
            // } We can directly find without using this condition i.e:
            max= Math.max(max, list.get(i));
        }
        System.out.println("Maximum element is: "+ max);
    }
    
}
