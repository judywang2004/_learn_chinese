
/**
    * input xyxxyxyxxyyxxx
    * pattern : xyx  = B; xxx =A
    * output: BB
     */ 


    

public class StateMachine2 {
    enum State{
        x,
        xy,
        xx,
        o
    }
    public static void main(String[] args){
        String s = "xyxxyxyxxyyxxx";
        String res ="";
        State st = State.o;

        for (int i=0;i<s.length();i++){
            
            if(st.equals(State.o)){
                if(s.charAt(i)=='x')
                    st = State.x;
            }else if (st.equals(State.x)){
                if(s.charAt(i)=='y')
                    st = State.xy;
                else if(s.charAt(i)=='x'){
                    st = State.xx;
                }    
            }else if (st.equals(State.xx)){
                if(s.charAt(i)=='x'){
                    res = res+'A';
                    st = State.o;
                    System.out.println("State.xx"+",i="+i+" ,"+res);
                }else if(s.charAt(i)=='y'){
                    st = State.xy;
                }
            }else if(st.equals(State.xy)){
                if(s.charAt(i) =='x'){
                    res = res+'B';
                    st = State.o;
                    System.out.println("State.xy"+",i="+i+" ,"+res);
                }else{
                    st=State.o;
                }
            }

        } // end of for loop
        System.out.println("Result is "+res);
    }
   



}
