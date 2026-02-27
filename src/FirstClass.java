import java.util.*;

class FirstClass{
    public static int factorial(int num1){
        if(num1<0){
            System.out.println("inalid number");
            return 0;
        }
        int factorial = 1;
        for(int i=num1;i>=1;i--){
            factorial = factorial * i;
            System.out.println(i);
        }

        return factorial;
    };

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();

        int factorial = factorial(num1);
        System.out.println(factorial);
    }
}