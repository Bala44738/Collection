package list.ArrayList;

public class Person1 {
	
	int id;
	int age;
	String name;
	String color;
	   
	     public Person1(int id, int age, String name , String color) {
	    	 this.id = id;
	    	 this.age = age;
	    	 this.name = name;
	    	 this.color = color;
	    	 
		}

		public int getId() {
			return id;
		}

		

		public int getAge() {
			return age;
		}

		

		public String getName() {
			return name;
		}

		

		public String getColor() {
			return color;
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		@Override
		public String toString() {
			return "Person1 [id=" + id + ", age=" + age + ", name=" + name + ", color=" + color + "]";
		}
		
		
		

		}

	     
	     
	
	


