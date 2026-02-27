import java.util.*;

public class arrayProblems {
    public static void main(String args[]){
//        Problem Statement 1
//        Take an array as input from user.
//        Search for a given number "x" and print the index at which it occurs.
//        Solution:
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

        System.out.println("please input the vulue you want the index of: ");
        int x = sc.nextInt();

        for(int i=0;i<size;i++){
            if(array[i]==x){
                System.out.println("The index of "+x+" is "+i);
                break;
            }else{
                System.out.println("We are sorry!!\nThe entered value does not exists in the system. ");
                break;
            }
        }
    }
}
