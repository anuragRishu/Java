package Patterns;

import java.util.Scanner;

public class HalfPyramidHorizontallyOpposite {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=col;j>0;j--){
//                System.out.print(j);
                System.out.print("*   ");
            }
            System.out.println();
            col -= 1;
        }
    }
}
