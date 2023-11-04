import java.util.ArrayDeque;
import java.util.Deque;


public class Stack {

    /**
     * 
     * Implement and return some class that implements Deque interface
     * 
     * @return an instantiated Deque which is used to create stacks and queues
     */

     public  Deque <String> createNewStack(){

                Deque<String>  stack    =  new ArrayDeque<>(){

                };
               return stack;
                }     
                
     /**
      * 
      *@return the number of elements in a stack
      */           
      public  int getSize( Deque <String> stack){
            int size = stack.size();
            return size;
      }

       /**
      * 
      *push an element to the top of the stack
      */   
      public void  addToTopOfStack(Deque <String> stack,  String item ){
            stack.push(item);
      } 

          /**
      * 
      *@return  the value of the element  popped from the top of the stack
      */   
      public String removeFromTopOfStack ( Deque <String> stack){
              String removed = stack.pop();
              return  removed;
      }

      /* *
      * Peek the value at the top of a deque.
      * @return  the value at the top without removing it
      */

      public String  getTopOfStack (Deque<String> stack){
                String peeked = stack.peek();
                return peeked;
      }

      public static void main(String[] args) {

           Stack  colorStack = new Stack();

        // create new Stack
        Deque< String> myStack =  colorStack.createNewStack();
         

        // Add to top of stack
        colorStack.addToTopOfStack(myStack, "Yellow");
         colorStack.addToTopOfStack(myStack, "Green");
        colorStack.addToTopOfStack(myStack, "Indigo");
        colorStack.addToTopOfStack(myStack, "Blue");

        System.out.println("This is the new stack  "  +  myStack);

        // // Get Stack Size
        int stackSize = colorStack.getSize(myStack);
        System.out.println("The size of the stack is  " + stackSize);

        // // Removed the item  from the top of the stack and get its value

        String  removedItem  = colorStack.removeFromTopOfStack(myStack);
        System.out.println("The item removed from top is " +  removedItem) ;

        // // Get the item at the top of stack without removing it 
        String peekedItem = colorStack.getTopOfStack(myStack);
        System.out.println("The item peeked at top is " +  peekedItem) ;

        // Print Updated map
        System.out.println("This is the updated stack  "  +  myStack);

        
    }
        
 }
      

  
    

