package SingletonTest;

public class ScopeTest {
	int z;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScopeTest myScope = new ScopeTest();
		int z=6;
		System.out.println(z);
		myScope.doStuff();
		System.out.println(z);
		System.out.println(myScope.z);
		// another one
		System.out.println("----------");//4
		int b=5;
		b--;
		System.out.println(b);//4
		System.out.println(b--);//4
		System.out.println(b--);//3
		System.out.println(--b);//1
		System.out.println(b);//1
		
		// another one
				System.out.println("----------");//4
		String[] table={"aa","bb","cc"};
		for(String ss:table){
			int ii=0;
			while(ii<table.length){
				System.out.println(ss+","+ii);
				ii++;
			}
		}
		
		// another one
		System.out.println("----------");//4
			 new Cougar().go();

	}
	
	 void doStuff(){
		int z=5;
		doStuff2();
		System.out.println(z);
		
	}
	  void doStuff2(){
		 z=4;
	 }
}

class Feline {
	 public String type = "f ";
	 public Feline() {
	 System.out.print("feline ");
	 }
	}
 class Cougar extends Feline {
	 public Cougar() {
	 System.out.print("cougar ");
	 }
	 void go() {
	 type = "c ";
	 System.out.print(this.type + super.type);
	 }	 
	 }
	


// 6564