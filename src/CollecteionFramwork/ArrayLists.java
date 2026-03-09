package CollecteionFramwork;
/*
ArrayList
.add() ++
.get() ++
.remove() ++
.set() ++
.size() ++
 Collections.sort(variable_name) ++
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    static void main(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        .add()--Method---->
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(9);

        numbers.add(1,3);
        System.out.println(numbers);

//        .get()--Method---->
        System.out.println(numbers.get(0));
        for(int i=0; i<numbers.size();i++){
            System.out.println("element at index "+i+":"+numbers.get(i));
        }

//        .remove()--Method---->
        numbers.remove(0);
        System.out.println(numbers);

//        .set()--function---->
        numbers.set(0,5);
        System.out.println(numbers);

//        .size()--Method---->
        int size = numbers.size();
        System.out.println("size of your ArrayList is "+size);


//        Cellection.sort(Variable_name)--Method---->

        Collections.sort(numbers);
        System.out.println(numbers);
    }

}
