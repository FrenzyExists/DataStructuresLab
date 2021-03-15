package sortersTesterClasses;

import experimentalClasses.ExperimentController;
import experimentalClasses.StrategiesTimeCollection;
import sorterClasses.BubbleSortSorter;
import sorterClasses.HeapSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

import java.io.FileNotFoundException;

public class ExperimentationMain {

    private static int[] params = {50, 1000, 50, 200};

    public static void main(String[] args) throws CloneNotSupportedException {
        if(args.length > 4) {
            System.out.println("Bitch params are 4, no more");
        }
        for(int i = 0; i<args.length; i++) {
            params[i] = Integer.parseInt(args[i]);
        }


        // Param 1: Initial Size
        // Param 2: Final Size
        // Param 3: Incremental Step (like a stair of sorts)
        // Param 4 Trial per size
        ExperimentController ec = new ExperimentController(params[0], params[1], params[2], params[3]);

        ec.addStrategy(new StrategiesTimeCollection<Integer>(new BubbleSortSorter<Integer>()));
        ec.addStrategy(new StrategiesTimeCollection<Integer>(new SelectionSortSorter<Integer>()));
        ec.addStrategy(new StrategiesTimeCollection<Integer>(new InsertionSortSorter<Integer>()));
        ec.addStrategy(new StrategiesTimeCollection<Integer>(new HeapSortSorter<Integer>()));

        ec.run();

        try {
            ec.saveResults();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
