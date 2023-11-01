import java.util.Deque;
import java.util.ArrayDeque;

 /*
  * @return true if str is a palindrome, false otherwise.
  */

public class Palindrome {

    public Boolean palin(String str){
        Deque<Character>  deck = new ArrayDeque<>();
            for(char x :  str.toCharArray()){
                deck.addLast(x);
            }

            while(deck.size() > 1){
                char front =   deck.removeFirst();
                char back =   deck.removeLast();

                if(front != back){
                    return false;
                }
            }
            return true;       
    }

    public static void main(String[] args) {
        Palindrome palindromeChecker = new Palindrome();
        String input = "racecar";

        if(palindromeChecker.palin(input)){
            System.out.println(input  + " is a palindrome ");
        }else{
            System.out.println( input + " is not a palindrome");
        }
    }
} 