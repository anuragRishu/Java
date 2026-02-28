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
                System.out.println("character "+(i+1)+" is a space");
            }else{
                System.out.println("character "+(i+1)+" is "+currenthar);
            }

        }
//---------------------------------------------------------------

// compareTo+-------------------------------------------------------


        System.out.println("First Nmae: "+FirstName);
        System.out.println("Last Name: "+LastName);

        if(FirstName.compareTo(LastName)==0){
            System.out.println("You Entered the same values for both first name and last name!!!");
        }

//---------------------------------------------------------------

//subString+-----------------------------------------------------
        System.out.println("Now, we will Select some parts of your name \ncheck the above character number list and tell me the range.");
        System.out.println("Start value: ");
        int FirstValue = sc.nextInt();
        System.out.println("End value: ");
        int SecondValue = sc.nextInt();

        System.out.println("Your desired part is here: ");
        System.out.println(FullName.substring(FirstValue-1,SecondValue));
    }
}
