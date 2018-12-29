package SingletonTest;

import java.util.function.Predicate;

public class MyPredict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating predicate 
        Predicate<Integer> lesserthan = i -> (i < 18);  //predicate is for testing function interface(just one abstract method)
  
        // Calling Predicate method 
        System.out.println(lesserthan.test(10));
        
        Predicate<Integer> greaterThanTen = (i) -> i > 10; 
        
        // Creating predicate 
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;  
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
        System.out.println(result); 
  
        // Calling Predicate method 
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 
        System.out.println(result2); 
   
	
	}

public static void predicate_or() 
{ 

    Predicate<String> containsLetterA = p -> p.contains("A"); 
    String containsA = "And"; 
    boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA); 
    System.out.println(outcome); 
} 

public static Predicate<String> hasLengthOf10 = new Predicate<String>() { 
    @Override
    public boolean test(String t) 
    { 
        return t.length() > 10; 
    } 
}; 
	 


}
