package SingletonTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Ikmtest8 {
	 static class Helper{
		 private int data=5;
		 public void bump(int inc){
			 inc++;
			 data=data+inc;
		 }
	 }
	 

	public static void main(String[] args) {
// TODO Auto-generated method stub
		//1:
		String str1="My String";
		String str2 = new String("My String");
//		System.out.println(String.parse(str1)==str2);
		System.out.println("My String");
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println(str1.hashCode()==str2.hashCode());
		System.out.println(str1.matches(str2));
		
		System.out.println("----Supplier----");
		
 Supplier <String> i=() ->"Car";
 Consumer<String> c= x->System.out.print(x.toLowerCase());
 Consumer<String> d=x->System.out.print(x.toUpperCase());
 c.andThen(d).accept(i.get()); //return carCAR
 System.out.println();
 c.equals(d); //--return false
// System.out.println(c.andThen(d).accept("t"));//compile error
 c.andThen(d).accept("i.get()"); //return carCARi.get()I.GET()
 System.out.println();
 System.out.println("-----helper-----");
 
Helper h =new Helper();
int data=2;
h.bump(data);
System.out.println(h.data+ " "+data);

System.out.println("----buffer------");

StringBuilder sb= new StringBuilder("buffering");
sb.replace(2, 7, "BUFFER");
System.out.println(sb.toString());
sb.delete(2, 4);
System.out.println(sb.toString());
String s = sb.substring(1, 5);
System.out.println(s); //uFFE

System.out.println("-----Predict----");
Predicate<String> containsLetterA = p -> p.contains("A"); 
Predicate<String> lengther= k -> k.length() <2;
Predicate<String> equalizer =Predicate.isEqual("car");
Function<Boolean,String> booleaner = b -> Boolean.toString(b);
Function<String,Boolean> stringer = s1 -> Boolean.parseBoolean(s1);

System.out.println("lengther.negate :"+lengther.negate());//lengther.negate :java.util.function.Predicate$$Lambda$10/1096979270@404b9385
System.out.println("equalizer.test car : "+(equalizer).test("CAR"));//false
System.out.println(lengther.negate().or(equalizer).test("CAR"));
System.out.println(lengther.negate().and(equalizer).test("CAR"));
System.out.println(booleaner.apply(true));//true
System.out.println(booleaner.compose(stringer).apply("true").substring(0,3));//tru
//System.out.println(booleaner.andThen(stringer).apply("true").substring(0,3));//error
System.out.println(booleaner.andThen(stringer).apply(true));//true
System.out.println(stringer.compose(booleaner).apply(true));//true


System.out.println("-----Stream----");
List<String> names=Arrays.asList("Jupiter","Neptune","Mars","Earth");
Map<Integer,List<String>> name_length =names.stream().collect(Collectors.groupingBy(p->p.length()));
name_length.forEach((l,t) -> System.out.print(l+"="+t+" "));
System.out.println();

System.out.println("-----declaration-222---");
//float testF =123_.2523F;
int $money =321;
long accNum = 1234_345_012L;
//long my#num=3425523423545L;
//int super =0b111;

//List<String> list=Arrays.asList("dog","over","good");
//list.stream().reduce((x1,x2) ->x1.length() > x2.length()? x1:x2).ifPresent(System.out::println);
//list.stream().reduce((x1,x2) ->x1.length() ==3? x1:x2).ifPresent(System.out::println);
//System.out.println(list.stream().reduce(new String(),(x1,x2) ->{if(x1.equals("dog"))return x1;return x2;}));
	
StringBuilder str= new StringBuilder();
for(String arg:args){
	if(str.indexOf(arg)<1)
		str.append(arg+" ");
}
System.out.println(str.toString());
Scanner sc= new Scanner(str.toString());
while(sc.hasNext()){
	if(sc.hasNextInt())
		System.out.print(sc.nextInt()+" ");
	else
		sc.next();
}
	
	}
	
//	static{int counter=0;};
//System.out.println(Stream.of("green","yellow","blue").max(s1,s2) -> s1.compareTo(s2))
//.filter(s->s.endsWith("n"))
//.orElse("yellow");
	
	public void writeFile(){
		Path inputFile =Paths.get("input.txt");
		Path outputFile =Paths.get("out.txt");
		try{
		BufferedReader reader = Files.newBufferedReader(inputFile,Charset.defaultCharset());
		BufferedWriter writer = Files.newBufferedWriter(outputFile,Charset.defaultCharset());
		String lineFromFile="";
		while((lineFromFile =reader.readLine()) !=null)
			writer.append(lineFromFile);
		}catch(IOException e){}
		
	}


}
