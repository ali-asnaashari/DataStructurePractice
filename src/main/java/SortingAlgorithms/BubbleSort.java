package SortingAlgorithms;

public class BubbleSort {

    public void sort(int[] array){
        boolean isSorted;
        for (int i = 0;i<array.length;i++){
            isSorted = true;
            for (int j = 1; j < array.length - i; j++) {
                swap(array,j,j-1);
                isSorted = false;
            }
            if (isSorted)
                return;
        }
    }
    public void swap(int[] array,int indexOne,int indexTwo){
        if (array[indexOne] < array[indexTwo]){
            int temp = array[indexTwo];
            array[indexTwo] = array[indexOne];
            array[indexOne] = temp;
        }
    }
}
