import javax.lang.model.util.ElementScanner6;

/**
 * We want to see if a string ends in a certain pattern
 * We want to know if the string ends with an @ followed by a series of digits and finally a # 
 * 
 * Examples:
 * - @3# 
 * - @1234987#
 * - @0112#
 */

 /**
  *  Might want to look for @ and #
  * Then take what is in between and see if it can be converted to an integer.
  * However, what if it is just a really big integer and you get overflow
  *

           | <- @ --- | -- @ -- |         
  0 --@--> 1 --0~9---> 2 --#-- > 3
                       /\(0~9)
  */

public class StateMachine {
    public static void main(String[] args){
        // String s = new String("a1@213#");
        String digits = new String("0123456789");

        String s="a2@3333#";
        int state =0;

        for (int i=0;i<s.length();i++){
            if(state ==0){
                if(s.charAt(i) =='@')
                    state=1;
            }else if (state ==1){
                if(digits.indexOf(s.charAt(i)) != -1) //digits exisits
                    state =2;
                else if(s.charAt(i)=='@')
                    state =1;    
                else 
                    state =0;    
            }else if (state ==2){
                if(s.charAt(i)=='#')
                    state =3;
                else if (digits.indexOf(s.charAt(i))!=-1) 
                    state=2;   
                else 
                    state=0;

            }else if (state==3){
                if(s.charAt(i)=='@')
                    state =1;
                else
                    state = 0;
            }
        } // end of for loop

        if(state==3)
                System.out.println(s+ " -- has matches");
            else
                System.out.println("It does not match");

    }
    
}
