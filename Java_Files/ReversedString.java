public class ReversedString {

    public static void main(String[] args) {

        String original = "Now is the time";
        StringBuilder sb = new StringBuilder(original);


        String reversed = sb.reverse().toString();

        System.out.println( "Original String eguals   "  + original  );

        System.out.println(" Reversed string :   "  + reversed  );

        
    }
    
}
