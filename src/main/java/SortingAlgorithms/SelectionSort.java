package SortingAlgorithms;

public class SelectionSort {

    public void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;
            swap(array,minIndex,i);
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
