import java.util.*;

public class Array {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("please input the Length: ");
        int size = sc.nextInt();
        int array [] = new int[size];

//      input loop
        for(int i =0;i<size;i++){
            int counter =i+1;
            System.out.println("please input value "+ counter);
            array[i]=sc.nextInt();

        }

//      output loop
         for( int i=0;i<size;i++){
             int counter =i+1;
             System.out.println("value "+counter +" :" +array[i]);

         }
    }
}
