import java.util.*;

public class Mentor {
	String name;
	String title;
	List <Student> students = new ArrayList<>();
	
	public Mentor(String str) {
		this.name = str;
	}
	
	public void add (Student std) {
		students.add(std);
		std.myMentor(this);
	}
	
	public void delete (Student std) {
		students.remove(std);
	}
	
	public void remind() {
		for (Student std : students ) {
			std.update();
		}
	}
	
	public void upload(String title) {
		this.title = title;
		remind();
	}
	
	
}
