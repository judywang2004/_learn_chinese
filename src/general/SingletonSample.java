package general;

public class SingletonSample {

	private SingletonSample(){
		
	}
	private static SingletonSample instance;
	
	//thread safe singleton
//	public static synchronized SingletonSample getInstance(){
	
	//lazy singleton
	public static SingletonSample getInstance(){
		if (instance ==null){
			instance = new SingletonSample();
		}
		return instance;
	}
	
}
