

/**
 *    Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
 * 
 * 
* @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
 */


public class ArrayCompare {

    public int compareChar(char []  a,  char [] b){

        int length = Math.min( a.length , b.length);
        for(int i = 0; i < length; i++){
            if(a[i] <  b[i]){
                return -1;   
            } else{
                if( a[i]  >  b[i]){
                    return 1;
                }
             }
           }
           if(a.length > b.length){
                return 1;
           }

            else  if(a.length < b.length){
                return -1;

           }else{
            return 0;
           }

    }

    public static void main(String[] args) {
        ArrayCompare  comparer = new ArrayCompare();

        char [] array1 = "pear".toCharArray();
        char [] array2 = "pumpkin".toCharArray();

        int result = comparer.compareChar(array1, array2);

        System.out.println( "The comparison result is :   "  +  result);
        }
    }

