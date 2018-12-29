package SingletonTest;

import java.math.BigDecimal;


public class SavingsAccount implements Account {
	public SavingsAccount(BigDecimal initialValue){
		balance =initialValue;
	}
	public String toString(){
		return balance.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount instance = new SavingsAccount(new BigDecimal(50.00));
		System.out.println(instance);
	}

}
