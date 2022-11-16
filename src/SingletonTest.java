package SingletonTest;

public class SingletonTest {
	private static final SingletonTest INSTANCE = new SingletonTest();
	private SingletonTest(){}
	
	public static SingletonTest getInstance(){
		return INSTANCE;
	}
	public void show(){
		System.out.println("Singleton using static initializaiton");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//public enum Singleton{
//    INSTANCE;
// 
//   public void show(){
//        System.out.println("Singleton using Enum in Java");
//   }
//}
//
//
//
//
////You can access this Singleton as Singleton.INSTANCE and call any method like below
//
//Singleton.INSTANCE.show();

//public class SingletonTest

