package SingletonTest;

public class ConcurrencyExample {
	private long count;
	public void incrementCount(){
		count++;
	}
	public long getCount(){
		return this.count;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final ConcurrencyExample ce = new ConcurrencyExample();
		for(int i=0;i<1000;i++){
			new Thread(new Runnable()){
				@Override
				public void run(){
					ce.incrementCount();
				}
			},"Thread"+i).start();// WHY error? 
		}
//		Thread a = new Thread(new Runnable(){public void run(){}},"a");
//		a.start();
		
       Thread.sleep(5000);
       System.out.println("Final number: "+ce.getCount());
	}

}
