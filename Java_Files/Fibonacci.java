
public class Fibonacci {

    /**
     * 
     * @param n
     * @return the nth number in the Fibonacci sequence
     */
        public int  fibonacci (int n){
            if(n <= 1){
                return n;
            }
            return fibonacci(n-1)  +  fibonacci(n -2);
            

    }

    public static void main(String[] args) {

        Fibonacci fib = new Fibonacci();
        int n = 10;
        int result =  fib.fibonacci(n);
        System.out.println("Fibonacci " + n  + ": "  + result);
        
    }
    
}
