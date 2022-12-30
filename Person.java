package list.ArrayList;

public class Person {
	
	    int id;
	    int age;
	    String name;
	    
	    
	    
	    
		public Person(int id, int age, String name) {
			super();
			this.id = id;
			this.age = age;
			this.name = name;
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
		
		
//
//		@Override
//		protected Object clone() throws CloneNotSupportedException {
//			// TODO Auto-generated method stub
//			return super.clone();
//		}
//
//		@Override
//		public boolean equals(Object arg0) {
//			// TODO Auto-generated method stub
//			return super.equals(arg0);
//		}
//
//		@Override
//		protected void finalize() throws Throwable {
//			// TODO Auto-generated method stub
//			super.finalize();
//		}
//
//		@Override
//		public int hashCode() {
//			// TODO Auto-generated method stub
//			return super.hashCode();
//		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
		}
		
		
	    

}
