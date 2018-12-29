package SingletonTest;

public class Ikmtest7 {
	
	static class Helper{
		private int data=5;
		public void bump(int inc){
			inc++;
			data=data+inc;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Helper h= new Helper();
// int data =2;
// h.bump(data);
// System.out.println(h.data+ ","+data);
		
//		System.out.println(new String("abc") == "abc");
//		System.out.println(new String("abc") == new String("abc"));
//		System.out.println(new String() == new String());
//		System.out.println("abc" == "abc");
//		System.out.println("abc".equals("abc"));
//		
		
//		boolean b=false;
//		System.out.println(b=false);
//		System.out.println(b=true);
//		Long i= new Long(10);
//		long j=10;
//		System.out.println(i.equals(j));
		
//		int x=-1;
//		x=x>>32;
//		System.out.println(x);
//		x=x>>1;
//		System.out.println(x);
//		x=x>>>1;
//		System.out.println(x);
//		x=x>>>0;
//		System.out.println(x);
//		x=x>>>32;
//		System.out.println(x);
		
//		String s1="My String";
//		String s2= new String("My String");
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1 ==s2);
////		System.out.println(String.parse(s1) ==s2);
//		System.out.println(s1.hashCode()==s2.hashCode());
//		System.out.println(s1.matches(s2));
		
//		int a=5;
//		int b=a++;
//		int c=++a;
//		System.out.println(b);
//		System.out.println(c);
//		
//		for (int x = 0; x < 8; ++x)
//		{
//		     for (int y = 1; y <= 5; ++y)
//		          System.out.print('%');
//		     System.out.println();
//		}
//		
//		for (int height = 4; height >= 0; height--)
//		{
//		     for (int x = height; x >= 0; x--)
//		          System.out.print('*');
//		     System.out.println();
//		}
		
//		BankAcct ba = new BankAcct("Eric Jones", 471347, 3500);
//		ba.deposit(50);
//		ba.withdraw(5000);
//		System.out.println(ba);
//		
//		Point2D pt = new Point2D(4, 8);
//		pt.move(-3, 7);
//		pt.moveTo(-3, 7);
//		pt.move(-3, 7);
//		System.out.println(pt);
		
//		int result = mystMethod(3, -1);
//		System.out.println(result);
		


//double d = (double)1 / (double)3;
//System.out.println(d);
//
//double d2 = (double)1 / 3;
//System.out.println(d2);
//
//double d3 = 1.0 / 3.0;
//System.out.println(d3);
//
//double d4 = 1 / 3;
//System.out.println( 29 % 8 );

//int C = 16.;
//
//
//fixed int C2 = 16;
//
//
//final int C3 = 16;
//
//
//const int C4 = 16;

		
String str = "12345";

//for (int i = 1; i <= str.length() - 1; i = i + 1)
//
// System.out.println(str.charAt(i));
//
//
//for (int i = 1; i < str.length() - 1; i = i + 1)
//
// System.out.println(str.charAt(i));
//
//
//for (int i = 0; i <= str.length(); i = i + 1)
//
// System.out.println(str.charAt(i));
//
//
//for (int i = 0; i < str.length(); i = i + 1)
//
// System.out.println(str.charAt(i));


int[] arr = {3, 6, 10, 15, 21};

//System.out.println(arr[2]);	
//System.out.println(arr.get(2));

int num=29;
while (num != 0)
{
	System.out.println(num); 
 num /= 2;
// System.out.println(num); //14,7,3,1
}
System.out.println("done");

//try
//{
//     System.out.println("Running ..."); // line 3
////    throws(Exception e);
//     System.out.println("Done!"); // line 54
//}
////catch (IOException e)
//{
//     System.out.println("IO Error!");
//}
//catch (Exception e)
//}
//     System.out.println("Error!");
//}
//finally
//{
//     System.out.println("Cleaning up ...");
//}


	} //main
	
	public static int mystMethod(int st, int mv)
	{
	     if (mv > st)
	     {
	          int diff = mv - st;
	          mv--;
	          return diff + mystMethod(st, mv);
	     }
	     else if (mv < st)
	     {
	          int diff = st - mv;
	          mv++;
	          return diff + mystMethod(st, mv);
	     }
	     else
	          return st;
	     }

}//class


class VIPInfo extends PersonInfo
{
 public void joeMethod()
 {
   this.name = "Fred"; // I
//   this.id = 399820; // II
   this.assets = 5798.13; // III
 }
}
class PersonInfo{
	public String name;
	private int id;
	protected double assets;
	
}

class Point2D
{
     private int x;
     private int y;

     public Point2D()
     {
          this.x = 0;
          this.y = 0;
     }

     public Point2D(int _x, int _y)
     {
          this.x = _x;
          this.y = _y;
     }

      public void move(int dx, int dy)
     {
          this.x += dx;
          this.y += dy;
     }

     public void moveTo(int new_x, int new_y)
     {
          this.x = new_x;
          this.y = new_y;
     }

     public String toString()
     {
          return "(" + this.x + ", " + this.y + ")";
     }
}


class BankAcct
{
     private String name;
     private int acct_id;
     protected double balance;

     public BankAcct (String my_name, int my_id, double my_bal)
     {
          this.name = my_name;
          this.acct_id = my_id;
          this.balance = my_bal;
     }

     public String myName() {return this.name;}
     public int myID() {return this.acct_id;}
     public double myBalance() {return this.balance;}

     public void deposit(double money)
     {
          this.balance +=money;
     }

     public void withdraw(double money)
     {
          if (this.balance < money)
               System.out.println("Insufficient funds!");
     else
          this.balance -= money;
     }

     public String toString()
     {
          return this.name + "'s Account #" + this.acct_id + ":\nbalance: $" + this.balance;
     }
}
