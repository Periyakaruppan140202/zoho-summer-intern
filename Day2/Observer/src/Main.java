
public class Main {
	public static void main(String args[]) {
		Student s1 = new Student("Peri");
		Student s2 = new Student("Ram");
		Student s3 = new Student("Kumar");
		Student s4 = new Student("Sachin");
		Student s5 = new Student("Sara");

		Mentor m = new Mentor("Avani Sudha");

		m.add(s1);
		m.add(s2);
		m.add(s3);
		m.add(s4);
		m.add(s5);

		m.upload("Task 1: Design Patterns in Java");

		m.delete(s5);
		m.upload("Task 2: Design JDBC Application using Java");
	}
}
