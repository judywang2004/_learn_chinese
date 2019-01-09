package oc8.test;

import oc8.AA;

public class B extends AA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//            main(args);
//        } catch (Exception ex) {
//            System.out.println("CATCH-");
//        }
//            System.out.println("OUT");

	}
	public void print() {
        AA obj = new AA();
        System.out.println(obj.i1); //Line 8
//        System.out.println(obj.i2); //Line 9
        System.out.println(this.i2); //Line 10
        System.out.println(super.i2); //Line 11
    }

}
