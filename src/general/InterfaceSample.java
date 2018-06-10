package general;

public interface Predator {
	boolean chasePrey(Prey p);
	void eatPrey(Prey p);

}

public class Lion implements Predator{
	@Override
	Public boolean chasePrey(Prey p){
		//programming to chase prey p specially for a lion
	}
	@Override
	public void eatPrey(Prey p){
		//programming to eat prey 
	}
}

//subinterfaces
public interface VenomousPredator extends Predator, Venomous{
	
}

// class implements multiple interfaces
public class Frog implements Predator, Prey{
	
}