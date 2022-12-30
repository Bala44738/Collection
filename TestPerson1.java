package list.ArrayList;

import java.util.ArrayList;

public class TestPerson1 {

	public static void main(String[] args) {
           
		
		     ArrayList<Person1> per = new ArrayList<Person1>();
		
//		ArrayList per = new ArrayList();
		     
		     Person1 p1 = new Person1(1,25,"Balu", "white");
		     Person1 p2 = new Person1(2,26,"Bunny", "white");
		     Person1 p3 = new Person1(3,27,"Sai", "Milky");
      	     Person1 p4 = new Person1(4,28,"Roy", "white");
		     Person1 p5 = new Person1(1,25,"Balu", "white");
		     
		         per.add(p1);
		         per.add(p2);
		         per.add(p3);
		         per.add(p4);
		         per.add(p5);
		     
		     
		     for(Person1 p :per) {
		    	 
		    	 System.out.println(p.getId()+"--"+p.getAge()+"--"+p.getName()+"--"+p.getColor());
		    	 
		     }

		     
	}

}
