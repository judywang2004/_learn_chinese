package oc8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2018-07-11"));
        dates.add(LocalDate.parse("1919-02-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
        dates.add(LocalDate.now());

        dates.removeIf(x -> x.getYear() < 2000);

//        System.out.println(dates);
        System.out.println("....Special String.............");
        
        System.out.println(new String("Java"));
        System.out.println(new StringBuilder("Java"));
        System.out.println(new SpecialString("Java"));
        
        System.out.println("....args.............");
//        short[] args = new shot[]{50,50};
//        args = new String[]{50,50};
//        args[0] =5;
//        args[1] =10;
//        System.out.println("["+args[0]+", "+args[1]);
        prt("........ this area.......");
        Point p1= new Point();
        p1.x=10;
        p1.y=20;
        Point p2= new Point();
        p2.assign(p1.x, p1.y);
        prt(p1.toString()+";"+p2.toString());
        
//        m1();// unhandled exception
        prt("........ List addALL.......");
        
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("D");
        
        List<String> list2= new ArrayList<>();
        list2.add("B");
        list2.add("C");
        
        list1.addAll(1,list2);
        System.out.println(list1);
        
        prt("........ Dog.......");
//        Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly","Poodle");
//        prt(dog1.getName()+":"+dog1.getBreed()+" , "+dog2.getName()+":"+dog2.getBreed());
        
        prt("........ args.......");
        short arr[] = new short[2];//ok
//        short[] arr ={};// arrayindexout of boundsexception
        arr[0] =5;
        arr[1] =10;
        
        prt(arr[0]+","+arr[1]);
        
        prt("........ msg.......");
        Message obj= new Message();
        obj.print();
        change(obj);
        obj.print();
        
        prt("........ list.......");
        String s = new String("Hellow");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hellow"));
        list.add(s);
        s.replace("l", "L");
        prt(list);
        
        prt("........ A,B.......");
        A obj1= new A();
//        B obj2=(B)obj1;// A can not be cast to B
//        obj2.print();
        
        B objb= new B();
        A obja =(A)objb;
        obja.print();//B , not A
        prt("........ employee e.......");
        List<Employee> liste = new ArrayList<>();
   	 liste.add(new Employee("James",25,15000));
        liste.add(new Employee("James", 25, 15000));
        liste.add(new Employee("Lucy", 23, 12000));
        liste.add(new Employee("Bill", 27, 10000));
        liste.add(new Employee("Jack", 19, 5000));
        liste.add(new Employee("Liya", 20, 8000));

        process(liste, e->e.getSalary()>=10000);

        System.out.println(liste);
        
        prt("........ -a++.......");
        int a= 100;
        
        System.out.println(a++); //100
        System.out.println(++a);//102        
        prt(-a++);//-102
        
        prt("........ -localtime.......");
        LocalTime time = LocalTime.of(16, 40);
      //  Localtime t2 = Localtime.of
        String amPm = time.getHour() >= 12 ?  "PM" : "AM";
        System.out.println(amPm);
        prt("........ period.......");
        Period period = Period.of(0,0,0);
        prt(period);
        LocalDate date=LocalDate.of(2020,9,30);//exception invalid date sep 31
        prt(date);
        
        System.out.println("output is "+( 10!=5));
        
        // --- switch
        byte var = 100;
        switch(var) {
            case 100:
                System.out.println("var is 100");
                break;
//            case 200:
//                System.out.println("var is 200");
//                break;
            default:
                System.out.println("In default");
        }
        
	}
	
	public static void prt(Object s){
		System.out.println(s);
	}
	private static void m1() throws Exception{
		prt("Not Throwing any exception");
	}
	public static void change(Message m){
		m= new Message(); // if comment out, it will printout happy holidays, otherwise, still the same happy new year
		m.msg="Happy Holidays";
	}
	
	
     private static void process(List<Employee> list, Predicate<Employee> predicate) {
         Iterator<Employee> iterator = list.iterator();
         while(iterator.hasNext()) {
             if(predicate.test(iterator.next()))
             iterator.remove();
         }
      }
	
}
