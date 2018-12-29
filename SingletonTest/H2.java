package SingletonTest;

public class H2 {
static String mapme(Y2 y,StringMapper<Y2> t){
	return t.map(y);
}
static String mapme(X x,StringMapper<X> t){
	return t.map(x);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(mapme(new Y2<>(new X("HELLO")),e->{return e.toString();}));//hello
System.out.println(mapme(new Y2<>("HELLO"),e->e.toString()));//HELLO
System.out.println(mapme(new Y2<>(3),e->{return e.toString().equals("3")? "hello":"HELLO";}));
System.out.println(mapme(new X("HELLO"),e->{if(e.s.charAt(0)=='H') return e.toString();return e.toLowerCase();}));

short x=2;
switch(x){
	case 0 : System.out.print("0");
	case 1 : System.out.print("1");
	case 2 : System.out.print("2");
	case 3 : System.out.print("3");

}
	}

}
