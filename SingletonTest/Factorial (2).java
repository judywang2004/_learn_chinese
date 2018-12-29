package SingletonTest;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int theNum =1,theFact;
		
		theFact = fact(theNum);

	}
	static int fact(int n){
		if(n<=1)
			return 1;
		else
			return n*fact(n-1);
	}

}
