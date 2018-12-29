package SingletonTest;
import java.util.Calendar;
import java.util.Set;

class MyCollection<T>{
	private Set<T> set;
	public Set<T> getCollection(){
		return this.set;
	}
}

class Shape{}
class Qua extends Shape{}
class Tri extends Shape{}

public class TestCollection {
	int x=5;
	
	static int num1=10;
	static int num2=getvalue();
	static int getvalue(){
		return num1;
	}
	static int dosum(){return num1+num2;}
	static int dominus(){return num1-num2;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		public int x=5;
		 int a=5,b=2;
		 System.out.println("num1+num2 = "+dosum());
		 System.out.println("num1-num2 = "+dominus());
		
//		 Calendar cal =Calendar.getInstance();
//		 cal.set(2000, Calendar.AUGUST,30);
//		 cal.roll(Calendar.MONTH,7);
//		 System.out.println(cal.get(Calendar.MONTH)+ "/"+cal.get(Calendar.DATE));
//		 cal.add(Calendar.MONTH,11);
//		 System.out.println(cal.get(Calendar.MONTH)+ "/"+cal.get(Calendar.DATE));
//		 
//		 a=9;
//		 float f;
//		 f=a/b;
//		 System.out.println("f= "+f);
//		 f=f/2;
//		 System.out.println("f= "+f);
//		 f=a+b/f;
//		 System.out.println("f= "+f);
//		 
		 // another one
		 Shape shape = new Qua();
		 Qua qua = new Qua();
		 
//		 Tri tri=(Tri)shape;
		// Tri tri2 = (Tri) qua; //compile error: canot cast

	}
	
	
	public void testCollection(MyCollection<?> collection){
		Set<?> set =collection.getCollection();
		//Set<T> set =collection.getCollection();//
		//Set set =collection.getCollection();//
//		Set<E> set =collection.getCollection();
	}
	
	public enum Report{
		EXMPPT(1,"Examp"),MGRPPT(2,"manger");
		private String name;
		private int id;
		
		
	}
	

}
