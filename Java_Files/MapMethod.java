import java.util.HashMap;
import java.util.Map;

/**
 *  @return a new Map 
 */

public class MapMethod {

    public Map<Integer, String>  createMap(){
        Map<Integer,String> myMap = new HashMap<> ();

        return myMap;
    }

    /**
     * 
     * @param map
     * @return  the size of map.
     */

    public int getSize(Map<Integer,String> map){
        int size = map.size();
 
        return size;
    }

      /**
     * Inserting  key/value pair into a map.
     * @param map 
     * @param key 
     * @param value 
     * @return 
     */

     public void addKeyValuePair(Map<Integer,String> map, int key, String value){
        map.put(key, value);
    }

        /**
     * @return the value associated with key in map.
     */
    public String getValueFromKey(Map<Integer, String> map, int key){
             String result = map.get(key);

        return  result;
    }

        /**
     * Remove a key/value pair from a map.
     * @return 
     */
    public void removeKeyValuePair(Map<Integer, String> map, int key){
        map.remove(key);
    }

        /**
     * Update the value related to a certain key in a map.
     * @return 
     */
    public void updateValue(Map<Integer, String> map, int key, String value){
        map.put(key, value);
    }

    public static void main(String[] args) {
        MapMethod mapMethod = new MapMethod();

        // create new map
        Map<Integer, String> myMap =  mapMethod.createMap();

        // Add Key/Value pairs to map
        mapMethod.addKeyValuePair(myMap, 1, "Avocado");
        mapMethod.addKeyValuePair(myMap, 2, "tomatoes");
        mapMethod.addKeyValuePair(myMap, 3, "Spinach");
        mapMethod.addKeyValuePair(myMap, 4, "Vegan Mayo");

        // // Get Map Size
        int mapSize = mapMethod.getSize(myMap);
        System.out.println("The size of the map is  " + mapSize);

        // // Get the value associated with  key/value pair
        String  valueRetrieved = mapMethod.getValueFromKey(myMap,  1);
        System.out.println("The value for key 1  is " + valueRetrieved) ;

        // // Remove a key/value pair
        mapMethod.removeKeyValuePair(myMap, 2);

        // // Update value in key/value pair
        mapMethod.updateValue(myMap, 4, "Canyon Bakery");

        // Print Updated map
        System.out.println("This is the updated map  "  +  myMap);
        
    }
   
}
