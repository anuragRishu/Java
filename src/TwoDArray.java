import java.util.*;


public class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array row: ");
        int row = sc.nextInt();
        System.out.println("Enter the array col: ");
        int col = sc.nextInt();

        int twoDArray [][]= new int[row][col];

//        input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                twoDArray[i][j]= sc.nextInt();
            }
        }

//        output
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(twoDArray[i][j]+" ");
            }
            System.out.println();
        }

    }
}

