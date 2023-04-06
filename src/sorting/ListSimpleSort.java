package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSimpleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			list.add((int) (Math.random()*100));
		}
		System.out.println("initial list:"+list);
	//	Collections.sort(list);
		Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object  o1, Object o2) {
				// TODO Auto-generated method stub
				return  ((int) o1 >(int) o2 ) ? 1:-1; // if o2,o1,then reversed
			}
			
		});
		System.out.println("sorted list:"+list );
		Collections.sort(list,Collections.reverseOrder()); //this reverse is just from high to low, not reverse previous seq
		System.out.println("reversed  list:"+list );
	}
	
	public void comparatorSort(List list) {
		Collections.sort(list,new Comparator() { // if this has @override ,it has compile error
			public int compare(Integer i1, Integer i2) {
				return (i2.intValue() >i1.intValue()) ? 1:-1;
			}

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}
	

}
