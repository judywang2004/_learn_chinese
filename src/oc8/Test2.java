package oc8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list = new ArrayList<>();
         list.add(100);
         list.add(200);
         list.add(100);
         list.add(200);
       //  list.remove(100);//indexout of bounds.
         list.remove(0);
 
         System.out.println(list); 
         
         LocalDateTime obj = LocalDateTime.now();
         System.out.println(obj.getSecond());
         
         List<String> dryFruits = new ArrayList<>();//ArrayList<String>();
         dryFruits.add("Walnut");
         dryFruits.add("Apricot");
         dryFruits.add("Almond");
         dryFruits.add("Date");
 
         Iterator<String> iterator = dryFruits.iterator();
         while(iterator.hasNext()) {
             String dryFruit = iterator.next();
             if(dryFruit.startsWith("A")) {
               //  dryFruits.remove(dryFruit); //concurrentmodificationexception
             }
         }
        
         System.out.println(dryFruits);
         
         String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
         
         Predicate<String> p = s -> s.toUpperCase().substring(0,1).equals("A"); 
         processStringArray(arr, p);
         
         StringBuilder sb = new StringBuilder("Java");
         String s1 = sb.toString();
         String s2 = sb.toString();
 
         System.out.println(s1 == s2);
         System.out.println("----------- stringbuilder ==string-----");
         String str = "java";
         StringBuilder sb2 = new StringBuilder("java");
 
         System.out.println(str.equals(sb2) + ":" + sb2.equals(str));
         
         LocalDate date = LocalDate.parse("1947-08-14");
         LocalTime time = LocalTime.MAX;
         System.out.println(date.atTime(time));
         char var =7;
         char var2 ='7';
//         char var3 = a;
         switch (var2) {
         case 7:
	         System.out.println("lucky no .7");
	         break;
         }
         
         

	}
	
	 private static void processStringArray(String [] arr, 
             Predicate<String> predicate) {
				for(String str : arr) {
					if(predicate.test(str)) {
						System.out.println(str);
					}
				}
}

}
