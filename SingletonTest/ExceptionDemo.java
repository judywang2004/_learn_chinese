package SingletonTest;

import java.util.Optional;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a=null;
Optional<String> b =Optional.empty();
try{
	System.out.println(a.length());
	System.out.print(b.orElse("").length());
}catch(Exception ex){
	System.out.println(a);
}finally{
	a="string";
	System.out.print(a.length());
	b=Optional.ofNullable("");
	System.out.println(b.get().length());
}

	}

}
