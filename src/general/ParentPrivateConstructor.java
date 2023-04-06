package general;

public class ParentPrivateConstructor {
    private int parent_age=50;
    public ParentPrivateConstructor(){
        init();
        callMe();

    }
    private void init(){
        System.out.println("parent -init");
    }
    public void callMe(){
        System.out.println("Parent-callme");
    }
    
}
