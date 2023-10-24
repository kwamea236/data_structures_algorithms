public class AlgorithmCode {
    public boolean linear_search(int[] arr, int number){

        for(int i =0; i < arr.length; i++){
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
