package Patterns;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
//        int row = 4;
//        int col = 4;

        for(int i=0;i<row;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }

    }


}
