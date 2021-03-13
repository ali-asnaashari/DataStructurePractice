package Array;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int value){
        if(items.length == count){
            int[] newItems = new int[count * 2];
            for (int i = 0 ; i < count ; i++)
                newItems[i] = items[i];
            items = newItems;
        }

        items[count++] = value;
    }

    public void print(){
        for (int i = 0 ; i < count ; i++)
            System.out.println(items[i]);
    }
}
