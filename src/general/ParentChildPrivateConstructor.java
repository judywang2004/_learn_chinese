package general;

public class ParentChildPrivateConstructor extends ParentPrivateConstructor{
    private int child_age =25;
    public ParentChildPrivateConstructor(){
        init();
        callMe();
    }
    private void init(){
        System.out.println("Child -init");
    }
    public void callMe(){
        System.out.println("Child - callMe");
    }
    public static void main(String[] args){
        ParentChildPrivateConstructor aChild = new ParentChildPrivateConstructor(); //parent -init,child callme, child init, child callme
        // if parent has private constrctor, call parent first, if parent has public ,call child public first.
        ParentPrivateConstructor aParent = null;

       aParent =(ParentPrivateConstructor) aChild;
        aParent.callMe(); //child callme
        //aParent.init(); //private method is invisible here



    }
    
}
