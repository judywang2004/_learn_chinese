package sorting;

import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Iterator; 
import java.util.List; 
import java.util.Comparator; 

public class SortByMoreThanOneField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<>();
		

	}

}

class CustomerSortingComparator implements Comparator<Student> { 
	  
    @Override
    public int compare(Student customer1, Student customer2) { 

        // for comparison 
        int NameCompare = customer1.getName().compareTo(customer2.getName()); 
        int AgeCompare = customer1.getAge().compareTo(customer2.getAge()); 
        // 2-level comparison using if-else block 
        if (NameCompare == 0) { 
            return ((AgeCompare == 0) ? NameCompare : AgeCompare); 
        } else { 
            return NameCompare; 
        } 
    }
    
    
}

class AmazonBoxSortingComparator implements Comparator<Student>{
//  int VersionCompare = customer1.getVersion().compareTo(customer2.getVersion());
	@Override
	public int compare(Student customer1, Student customer2) {
		
		if(isInteger(customer1.getVersion()) || isInteger(customer2.getVersion()))
			return 1;
		
    
	}
	
	static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}



class Student { 
	  
    // instance member variables 
    String Name; // amazon box id
    int Age; 
    String Version; // amazon box version, old box uses lower case english, new boxes uses positive int
  /**
   * 1: the box is ID + version
   * 2: old box uses lower case english as version , sort asending , new box uses int , keep original order
   * 
   */
    // parameterized constructor 
    public Student(String Name, Integer Age,String Version) { 
        this.Name = Name; 
        this.Age = Age; 
        this.Version = Version;
    } 
    public Student(String Name, String Version) { 
        this.Name = Name; 
        this.Version = Version;
    } 
  
    public String getName() { 
        return Name; 
    } 
  
    public void setName(String Name) { 
        this.Name = Name; 
    } 
  
    public Integer getAge() { 
        return Age; 
    } 
  
    public void setAge(Integer Age) { 
        this.Age = Age; 
    }
  
    public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		this.Version = version;
	}

	// overriding toString() method 
    @Override
    public String toString() { 
        return "Customer{" + "Name=" + Name + ", Age=" + Age + ", version=" + Version + '}'; 
    } 
}