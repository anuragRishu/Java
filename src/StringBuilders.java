public class StringBuilders {

    public static void main(String args[]){

//        StringBuilder Operations

        StringBuilder str = new StringBuilder("Anurag");

//        Reverse string----------------------
        for(int i=0;i<str.length()/2;i++){
            int FirstIndex=i;
            int SecondIndex=str.length()-(i+1);

            char firstChar = str.charAt(FirstIndex);
            char secondChar = str.charAt(SecondIndex);

            str.setCharAt(FirstIndex,secondChar);
            str.setCharAt(SecondIndex,firstChar);
        }

        System.out.println(str);

    }
}
