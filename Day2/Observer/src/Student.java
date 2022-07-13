
public class Student {
	String name;
	Mentor mentor;
	//Constructor
	public Student(String str) {
		this.name = str;
	}
	
	public void myMentor(Mentor mtr) {
		this.mentor = mtr;
	}
	
	public void update() {
		System.out.println("Hey "+name+", Your Mentor has given you new task: "+mentor.title);
	}
}
