package Practice;

import java.util.function.Function;

public class FunctionPractice {

	public static void main(String[] args) {
		//Function takes one object and returns one object for eg take an integer and return the square of it 
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(2));
	}

}
