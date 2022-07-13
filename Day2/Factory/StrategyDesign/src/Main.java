import com.operations.OP;
import com.operations.*;
import com.operations.Context;

public class Main {
	public static void main(String args[]) {
		Context c = new Context(new Addition());
		System.out.println(c.executeContext(5,3));
		
		c = new Context(new Subtraction());
		System.out.println(c.executeContext(5,3));
		
		c = new Context(new Multiplication());
		System.out.println(c.executeContext(5,3));

	}
}
