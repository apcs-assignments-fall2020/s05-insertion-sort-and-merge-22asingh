import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        // YOUR CODE HERE
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i ++){
            if (i == 0){
                output.add(list.get(i));
            }
            else{
                for (int x = 0; x < output.size(); x++){
                    if (list.get(i) < output.get(x)){
                        output.add(x, list.get(i));
                        break;
                    }
                }
                if (output.size() == i){
                    output.add(list.get(i));
                }
            }
        }
        return output;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        // YOUR CODE HERE
        int[] output = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < output.length; i++){
            if (index1 == arr1.length){
                output[i] = arr2[index2];
                index2++;
            }
            else if (index2 == arr2.length){
                output[i] = arr1[index1];
                index1++;
            }
            else if (arr1[index1] < arr2[index2]){
                output[i] = arr1[index1];
                index1++;
            }
            else {
                output[i] = arr2[index2];
                index2++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
