import java.util.Scanner;

/**
 * Ghost pacman game using statemachine
 * https://www.youtube.com/watch?v=tuVUkquMvZg&list=WL&index=51&t=10s
 * 
 */

 abstract class State{
    static State chase, run, move,rise,die,current;

    void enter(){}
    void update(){}
 }

 class Chase extends State{
        void enter(){
            System.out.println("Now in the Chase State");
        }
        void update(){
            while(true){
                System.out.println("1: Player dies");
                System.out.println("2: Player eats Power Pellet");
                Scanner s = new Scanner(System.in);
                String input = s.next();
                switch(input){
                    case "1":
                        current = move;
                        return;
                    case("2"):
                        current = run;
                        return;
                    default:
                        System.out.println("\n *** Error, Please make a selection from themenu");
                }
            }
        }
 }

 class Run extends State{
    void enter(){
        System.out.println("Now in the Run State");
    }
    void update(){
        while(true){
            System.out.println("1: Player die");
            
            Scanner s = new Scanner(System.in);
            String input = s.next();
            switch(input){
                case "1":
                    current = die;
                    return;
                
                default:
                    System.out.println("\n *** Error, Please make a selection from themenu");
            }
        }
    }
 }
 class Move extends State{
    void enter(){
        System.out.println("Now in the Move State");
    }
    void update(){
        while(true){
            System.out.println("1: Player response");
           
            Scanner s = new Scanner(System.in);
            String input = s.next();
            switch(input){
                case "1":
                    current = chase;
                    return;
                
                default:
                    System.out.println("\n *** Error, Please make a selection from themenu");
            }
        }
    }
 }
 class Rise extends State{
    void enter(){
        System.out.println("Now in the Rise State");
    }
    void update(){
        while(true){
            System.out.println("1: Player chase");
            
            Scanner s = new Scanner(System.in);
            String input = s.next();
            switch(input){
                case "1":
                    current = chase;
                    return;
            
                default:
                    System.out.println("\n *** Error, Please make a selection from themenu");
            }
        }
    }
 }
 class Die extends State{
    void enter(){
        System.out.println("Now in the Die State");
    }
    void update(){
        while(true){
            System.out.println("1: Player rise");
           
            Scanner s = new Scanner(System.in);
            String input = s.next();
            switch(input){
                case "1":
                    current = rise;
                    return;
                
                default:
                    System.out.println("\n *** Error, Please make a selection from themenu");
            }
        }
    }
 }


public class PacManGhostStateMachine {
    public static void main(String[] args){
        State.chase = new Chase();
        State.run = new Run();
        State.die = new Die();
        State.move = new Move();
        State.rise = new Rise();
        State.current = State.rise;

        while(true){
            State.current.enter();
            State.current.update();
        }
    }
    
}
