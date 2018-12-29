package SingletonTest;

public class Z extends Y{
	public Z(){
		super();
		System.out.println("Z"); doSomthing();
	}
	public Z(int i){
		this();
	}
	public Z(String s){
		
	}
	public void doSomthing(){System.out.println("Z do somthing");}
}
