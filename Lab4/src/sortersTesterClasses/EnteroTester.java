package sortersTesterClasses;

import sorterClasses.*;

import java.util.Random;

public class EnteroTester {

    public static void main(String[] args) {
        BubbleSortSorter<Entero> Test1 = new BubbleSortSorter<>();
        SelectionSortSorter<Entero> Test2 = new SelectionSortSorter<>();
        InsertionSortSorter<Entero> Test3 = new InsertionSortSorter<>();
        HeapSortSorter<Entero> Test4 = new HeapSortSorter<>();
//        QuickSortSorter<Entero> Test5 = new QuickSortSorter<>();

        System.out.println("Array Before");
        Entero[] testy = createLst(20);
        printArray(testy);
        System.out.println("Array ordered with Bubble Sort");
        Test1.sort(testy, null);
        printArray(testy);

        System.out.println("Array Before");
        testy = createLst(20);
        printArray(testy);
        System.out.println("Array Sorted with Selection Sort");
        Test2.sort(testy, null);
        printArray(testy);

        System.out.println("Array Before");
        testy = createLst(20);
        printArray(testy);
        System.out.println("Array Sorted with Insertion Sort");
        Test3.sort(testy, null);
        printArray(testy);

        System.out.println("Array Before");
        testy = createLst(20);
        printArray(testy);
        System.out.println("Array Sorted with Heap Sort");
        Test4.sort(testy, null);
        printArray(testy);
    }

    private static Entero[] createLst(int n) {
        Entero[] arr = new Entero[n];
        Random r = new Random();

        //        append        //
        for (int i=0; i<arr.length; i++) {
            Entero e = new Entero(r.nextInt(50));
            arr[i] = e;
        }
        return arr;
    }

    public static void printArray(Entero[] arr) {
        System.out.print("{ ");
        for (int i=0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i] + " }");
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.println("\n");
    }
}
