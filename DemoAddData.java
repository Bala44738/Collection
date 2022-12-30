package list.ArrayList;

import java.util.ArrayList;

public class DemoAddData {

	public static void main(String[] args) {
             
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(202);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		
//		al.addAll(l);   // Present in all l data add to al  (Update all the data)
//		System.out.println(al);
		
//		al.addAll(2, l);    // whatever data in l it will be added in al from position 2 
//		System.out.println(al);
//		
//		al.removeAll(l);       // Same data will be removed in both arrays(al, l)
//		System.out.println(al);
//		
		al.retainAll(l);     //can't undrstand
		System.out.println(al);
//		
//		
//		al.add(150);   
//		System.out.println(al);
//		
//		System.out.println(al.contains(2000));  //to compare the two values use contains
//		System.out.println(al.contains(40));
//		
//		System.out.println(al.getClass());  // know the class name
//		
//		System.out.println(l.indexOf(50));
//		
		
//		System.out.println(al);
//		al.set(1, 2000);
//		System.out.println(al);
		
		
		
		
		
	}

}





//reaghatehdndg	Add() and Set():-

//Add() will shift all the elements to the right side from a paticular index and create 
//a empty location and then insert the new element into the empty location

//set() will replace existing data with new data


//Disadvantage of arrayList:-
//------------------------

//ArrayList is a good approch if the data has to be added the rear end. if the data has to be added between
//the arrayList will consumed a lots of time and hence not a good approch
//
//to overcome the problem we can make use of linkedList
