import javax.xml.transform.Source;
import java.util.*;

public class Strings {
    public static void main(String args[]){
//        String FirstName = "Anurag";
//        String LastName = "Chaurasiya";
//        String FullName = FirstName+" "+ LastName;    // Concatenated using "+" Operator

// input-output Strings+----------------------------------------
        System.out.println("Let's do the Postmortem of your Name");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first Name: ");
        String FirstName = sc.nextLine();

        System.out.println("Please enter your last Name: ");
        String LastName = sc.nextLine();

        String FullName = FirstName+" "+ LastName;    // Concatenated using "+" Operator

        System.out.println("Your name is "+ FullName);


//---------------------------------------------------------------


// String concatenation+-----------------------------------------
        System.out.println("this is the concatenated string: "+FullName);

//---------------------------------------------------------------


// ".length() Method"+-------------------------------------------
        System.out.println("Your Name has "+FullName.length()+" charectors including spaces");

//---------------------------------------------------------------


// charAt+-------------------------------------------------------
        for(int i =0;i<FullName.length();i++){         // implemented the ".length" method.
            char currenthar = FullName.charAt(i);
            if(currenthar == ' '){
                System.out.println("charector "+(i+1)+" is a space");
            }else{
                System.out.println("charector "+(i+1)+" is "+currenthar);
            }

        }
//---------------------------------------------------------------
    }
}
