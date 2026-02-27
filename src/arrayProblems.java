import java.util.*;

public class arrayProblems {
    public void OneDArray() {

        //        Problem Statement 1:
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
            }
        }

    };

    public void TwoDArray(){
        //        problem statemen 2:
//        Take a matrix as input from the user.
//        Search for a given number x and print the indices at which it occurs.

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

        System.out.println("Now enter a number and i will tell you the index in 2D Array: ");
        int y = sc.nextInt();

//        output
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(twoDArray[i][j]==y){
                    System.out.print(i+" "+j);
                    break;
                }

            }
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("1 for OneDArray\n2 for TwoDArray");
        int choise = sc.nextInt();
        arrayProblems instance = new arrayProblems();

        if(choise==1){
            instance.OneDArray();
        }else if(choise==2){
            instance.TwoDArray();
        }else{
            System.out.println("invalid input!!");
        }




    }
}
