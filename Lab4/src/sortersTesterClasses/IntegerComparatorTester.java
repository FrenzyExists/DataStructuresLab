package sortersTesterClasses;

import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class IntegerComparatorTester {
    private static Random random;
    private static ArrayList<Sorter<Integer>> sortersList = new ArrayList<Sorter<Integer>>();


    public static void main(String[] args) {
        sortersList.add(new BubbleSortSorter<Integer>());
        sortersList.add(new SelectionSortSorter<Integer>());
        sortersList.add(new InsertionSortSorter<Integer>());

        test("Sorting Using Default Comparator<Integer>", null);
        test("Sorting Using IntegerComparator1", new IntegerComparator1());
        test("Sorting Using IntegerComparator2", new IntegerComparator2());

    }
    private static void test(String msg, Comparator<Integer> cmp) {
        random = new Random((101));
        System.out.println("\n\n****************************************");
        System.out.println("****** " + msg + " ******");
        System.out.println("******************************************\n\n");

        Integer[] original, arr;
        for (int i=1; i<=20; i += 5) {
            original = randomValues(i);
            showArray("\n ---Original array of size " + i + " to sort:", original);

            for (int s=0; s<sortersList.size(); s++) {
                Sorter<Integer> sorter = sortersList.get(s);
                arr = original.clone();
                sorter.sort(arr, cmp);
                showArray(sorter.getName() + ": ", arr);
            }
        }


    }

    private static void showArray(String msg, Integer[] a) {
        System.out.print(msg);
        for (int i=0; i<a.length; i++)
            System.out.print("\t" + a[i]);
        System.out.println();
    }

    private static Integer[] randomValues(int i) {
        Integer[] a = new Integer[i];
        for (int j=0; j<i; j++)
            a[j] = random.nextInt(100);
        return a;
    }

}
