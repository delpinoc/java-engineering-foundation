
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int indexSmallest = -1;
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]){
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexSmallest = -99;
        int smallestNumber = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (smallestNumber >= table[i]) {
                smallestNumber = table[i];
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }
    
    
    
    
    

}
