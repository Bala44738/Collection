package list.ArrayList;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) {
             
		     
		ArrayList<Person> p = new ArrayList<Person>();
		
		Person p1 = new Person(3, 25, "Balu");
		Person p2 = new Person(4, 26, "Roy");
		Person p3 = new Person(5, 27, "Sai");
		Person p4 = new Person(3, 25, "Balu");
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		
//		System.out.println(p.get(1).toString());        //only print for single person details
		
		
		
		for(Person str :p) {
			System.out.println(str.getId()+"-"+str.getAge()+"-"+str.getName());
			
		}
		
		
		
	}

}
