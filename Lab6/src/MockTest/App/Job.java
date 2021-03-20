package MockTest.App;

import MockTest.App.Implementations.Nody;
import MockTest.App.Implementations.Stack.LinkedStack;
import MockTest.App.Interfases.Stack;

/**
 * A Job for this lab activity. 
 * @author pedroirivera-vega
 *
 */
public class Job {
	private int pid;            // id of this job
	private int arrivalTime;    // arrival time of this job
	private int remainingTime;  // remaining service time for this job
	private int departureTime;  // time when the service for this job is completed
	public Job(int id, int at, int rt) { 
		pid = id; 
		arrivalTime = at; 
		remainingTime = rt; 
	}
	public int getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	public int getPid() {
		return pid;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	public int getRemainingTime() {
		return remainingTime;
	}

	/**
	 * Registers an update of service received by this job. 
	 * @param q the time of the service being registered. 
	 */
	public void isServed(int q) { 
		if (q < 0) return;   // only register positive value of q
		remainingTime -= q; 
	}

	/**
	 * Generates a string that describes this job; useful for printing
	 * information about the job.
	 */
	public String toString() { 
		return "PID = " + pid + 
				"  Arrival Time = " + arrivalTime +
				"  Remaining Time = " + remainingTime +
				"  Departure Time = " + departureTime; 				
	}

	public static <T> T[] removeLessThan(LinkedStack<T> stack, T node) {
		T[] newArray = null;

		Stack<T> stay = new LinkedStack<>();
		Stack<T> leave = new LinkedStack<>();

		while (!stack.isEmpty()) {
			T e = stack.pop();
			if ( ((Comparable<T> ) e).compareTo(node) <0 ) {

			}
		}
		return newArray;
	}
}

