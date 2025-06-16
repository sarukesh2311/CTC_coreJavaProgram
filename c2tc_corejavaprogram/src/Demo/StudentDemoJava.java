package Demo;

public class StudentDemoJava {

	public static void main(String[] args) {
		Student st =new Student ();
		st.setId( 101);
		st.setName ("mani");
		st.setAge  (20);
		System.out.println("ID:"+st.getId());
		System.out.println("Name:"+st.getName());
		System.out.println("Age:"+st.getAge());
	}

}
