package sorterClasses;

public class QuickSortSorter<E> extends AbstractSorter<E>{
    /**
     * @param name
     */
    public QuickSortSorter(String name) {
        super(name);
    }

    public QuickSortSorter() {
        super("Quicksort");
    }


    @Override
    protected void auxSort() {

    }

    public void quickSorttail(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSorttail(arr, begin, partitionIndex-1);
            quickSorttail(arr, partitionIndex+1, end);
        }
    }


    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
