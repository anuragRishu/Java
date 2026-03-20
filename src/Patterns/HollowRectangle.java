package Patterns;

public class HollowRectangle {
    public static void main(String args[]){
        int num1 =4;
        int num2 =4;
        for(int i=1;i<=num1;i++){
            for(int j=1;j<=num2;j++){
                if(i==1||j==1||i==num1||j==num2){
                   System.out.print("#  ");
//                    System.out.print("  #"+i+","+j+" ");
                }else{
                    System.out.print("   ");
//                    System.out.print("  E("+i+","+j+")");
                }
            }
            System.out.println();

        }
    }
}
/*

                  (1,1) (1,2) (1,3) (1,4)
                    #     #     #     #
                  (2,1) (2,2) (2,3) (2,4)
                    #                 #
                  (3,1) (3,2) (3,3) (3,4)
                    #                 #
                  (4,1) (4,2) (4,3) (4,4)
                    #     #     #     #


                            #  #  #  #
                            #        #
                            #        #
                            #  #  #  #


 */
