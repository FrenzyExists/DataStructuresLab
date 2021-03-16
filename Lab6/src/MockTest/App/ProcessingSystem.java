package MockTest.App;

import MockTest.App.Exceptions.EmptyQueueException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class ProcessingSystem {
	
	/*We need 2 queues and an ArrayList (use Java's implementation of ArrayList)*/
	
	/**
	 * Use whatever Queue you implemented in part 1 and add it to this project
	 * With either implementation (assuming the ArrayQueue and/or LinkedQueue was implemented correctly)
	 * the processing system should be able to process jobs correctly
	 */
	
	
	public ProcessingSystem() { 
		/*Initialize your data structures here, kill steps 1-3 here*/
	}

	/**
	 * PART 2: IMPLEMENT THIS METHOD THAT RUNS THE PROCESSING SYSTEM
	 * 
	 * HINT: USE THE PSEUDOCODE FROM THE DOCUMENTATION GIVEN
	 * 
	 * @throws FileNotFoundException
	 * @throws EmptyQueueException
	 */
	public void run() throws FileNotFoundException /*,EmptyQueueException REMOVE THIS COMMENT*/ { 
		
		/*STEP 1 HERE*/
		
		/*STEPS 4-5 here*/
		
		/*STEP 6 HERE*/
	}

	/**
	 * PART 3: IMPLEMENT THIS METHOD THAT COMPUTES AND SHOWS THE STATISTICS GIVEN IN THE SPECIFICATIONS
	 */
	private void computeAndShowStatistics() {
		/**
		 *As per the specifications, statistics are 
		 *the average of the times taken to do each job
		 *
		 *Remember to print the time
		 */
		
	}
	
	
	/**
	 * PART 1: IMPLEMENT THIS METHOD THAT READS THE DATA FROM input.txt
	 * 
	 * USE THE INPUT DATA PROVIDED IN MOODLE
	 * @throws FileNotFoundException
	 */
	private void readInputData() throws FileNotFoundException {
		
		//each line in the file is assumed to contain two integers separated by a comma
		File inputFile = new File("input.txt"); //Remember to add input.txt in root directory
		Scanner input = new Scanner(inputFile); //use the hasNextLine()/nextLine() methods from the scanner class
		int jobID = 1; //PID given by the system, increments by each job given
		
	}

	/*HINT: USE THIS METHIS TO HELP YOU CREATE THE JOBS TO ENQUEUE TO THE INPUT QUEUE*/
	private Job constructJobFromInput(String inputString, int jobID) {
		
		/*Hint, use the split() method from the String class to separate data by the comma*/
		
		// input is assume to be correct - two integers separated by comma. 
		
		return new Job(0,0,0); //Dummy Job, what do we need to put in each constructor parameter?

	}
}
