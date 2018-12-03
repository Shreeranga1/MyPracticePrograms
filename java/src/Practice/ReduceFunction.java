package Practice;

import java.util.stream.Stream;

public class ReduceFunction {

	public static void main(String[] args) {
	/*	Sums all the numbers and prints out the value
	*   Uses BiFunction which has both input and output same 
	*	get is method of function
	*
	*
	*/
		System.out.println(Stream.of(1,2,23,3,34,4,54,5,6,67,67,56).reduce((x,y)->x+y).get());
	}

}
