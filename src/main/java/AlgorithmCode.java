/**
 * Author: Raymond Ghanney Ato
 * Date: 23-10-23
 * Subject: Data Structures and Algorithm implementation in java.
 * */


public class AlgorithmCode {

    /**
     * This function is the implementation of the
     * Linear search algorithm
     * @param arr An array of items
     * @param number item to be searched
     * */
    public boolean linear_search(int[] arr, int number){

        for(int i =0; i < arr.length; i++){
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
