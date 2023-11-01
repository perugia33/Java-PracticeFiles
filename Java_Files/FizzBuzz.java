public class FizzBuzz{

        public static String  FizzBuzzGen(int n){
        
                if(n % 3 == 0 && n % 5 == 0){
                    return "FizzBuzz";

                }else if( n % 3 == 0){
                    return "Fizz";

                }else if(n % 5 == 0){
                    return "Buzz";
                }else{
                    return  Integer.toString(n);
                }
            }

    public static void main(String[] args) {

        for(int i = 0;  i <= 30; i++){
              System.out.println(FizzBuzzGen(i));

        }
    }

}  

