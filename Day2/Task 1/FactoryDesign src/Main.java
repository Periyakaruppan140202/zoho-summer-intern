import com.operations.OP;
import com.operations.Operation;

public class Main {
	public static void main(String args[]) {
		OP obj = Operation.getInstance("mul");
		System.out.println(obj.calculate(5, 3));

	}
}
