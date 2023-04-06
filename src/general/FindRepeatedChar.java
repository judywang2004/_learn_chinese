package general;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Given a array/list of strings and print out the list of words which is repeated.
  e.g: input :  a,b,c,d,e, a,c,e.
  output: a,c,e
 */

public class FindRepeatedChar {    
    public static void main (String[] args){
        // input using scanner
        // Scanner sn = new Scanner(System.in);
        // String input = sn.nextLine();
        String input = "   a,     b,c,d,e, a,c,   e,   ";
        input = input.replaceAll("\\s","").toLowerCase();
        // System.out.print("remove spaces:"+input);
        // input = input.trim().toLowerCase(); // trim only remove the front and end spaces.
        // System.out.print("remove spaces2:"+input);
        // print(input);
        // method1(input);
        method3(input);

     }

    //Method 1: using hashmap, stringtokenizer
     public static void method1(String input){
        Map<String,Integer> wordMap = new HashMap<String,Integer>();
        StringTokenizer st = new StringTokenizer(input,",");
       // print(st.toString());
        while(st.hasMoreTokens()){
            String tmp = st.nextToken().toLowerCase();
            // print(tmp);
            if(wordMap.containsKey(tmp)){
                // int count = wordMap.get(tmp);
                // count ++;
                wordMap.put(tmp,wordMap.get(tmp)+1);
            }else{
                wordMap.put(tmp, 1);
            }
        }
// // print out hashmap using keySet
//         for(String key:wordMap.keySet()){
//             print(key + " = "+wordMap.get(key));

//         }
// print out hashmap using entryset
//Entry<String, Integer> wordS = wordMap.entrySet();
// Set<String> keySet = wordMap.keySet();
// Set<Integer> valueSet =new HashSet<Integer>( wordMap.values());
// valueSet.forEach(value->System.out.println(value)); //only print 1,2 . no repeat
// keySet.forEach(key->System.out.println(key));//only print abcde
}

public static void method2(String input){ // use string.split,map
    String[] words = input.split(",");
    Map<String,String> wordMap = new HashMap<String,String>();
    for(int i=0;i<words.length;i++){
        String word = words[i].toLowerCase();
        if(wordMap.get(word) !=null){
            System.out.println("Duplicated");
        }else{
            wordMap.put(word,word);
        }
    }

}

public static void method3(String input){ //use Arrays.asList ; collections.frequency(collection,object)
    List<String> list = Arrays.asList(input.split(","));
   Set<String> set  = new HashSet<String>(list);
    for(String word: set){
        print(word+":"+Collections.frequency(list, word));
    }

}

     public static void print(String anything){
        System.out.println(anything);
     }




}
