

public class FibonacciList {
    /**
     * 
     * @return a list of numbers in the Fibonacci sequence up to a limit(n)
     */

        
        public static void printFibonacciList(int n){
           int a = 0;
            int b =1;
            System.out.println("Fibonacci sequence up  "  + n +  ": ");
            System.out.print(a +  " ");

            
        
            while(  b <= n){
                System.out.print(b + " ");
                int next = a + b;

                a = b;
                b = next;            
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int n = 100;
            printFibonacciList(n);
        }
    }
    


