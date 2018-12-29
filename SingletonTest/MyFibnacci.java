package SingletonTest;

import java.util.function.Function;
import java.util.stream.Stream;

public class MyFibnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] fibs = {0, 1};
		Stream<Integer> fibonacci = Stream.generate(() -> {
		    int result = fibs[1];
		    int fib3 = fibs[0] + fibs[1];
		    fibs[0] = fibs[1];
		    fibs[1] = fib3;
		    return result;
		});
		
		
		Function<Integer, String> intToString = Object::toString;
		Function<String, String> quote = s -> "'" + s + "'";
		 
		Function<Integer, String> quoteIntToString = quote.compose(intToString);
		 
//		assertEquals("'5'", quoteIntToString.apply(5));
		Function<Integer, Integer> times2 = e -> e * 2;

		Function<Integer, Integer> squared = e -> e * e;  
//		Next, let's combine them, using compose and andThen.
		times2.compose(squared).apply(4);  
		// Returns 32

		times2.andThen(squared).apply(4);  
		// Returns 64
		/**
		compose and andThen is the order they execute the functions.
		While the compose function executes the caller last and the parameter first,
		the andThen executes the caller first and the parameter last.
		*/
	}

}
