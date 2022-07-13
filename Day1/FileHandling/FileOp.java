import java.io.*;
import java.util.*;

class FileOp {
    public static void main(String[] args) throws Exception {

        // Create a File and write the file
        FileWriter fw = new FileWriter("helloworld.txt");
        fw.write("Hello World!");
        fw.close();

        // Read a file
        Scanner sc = new Scanner(new File("helloworld.txt"));
        System.out.println(sc.nextLine());

        // Append More text to existing file
        BufferedWriter out = new BufferedWriter(new FileWriter("helloworld.txt",
                true));
        out.write("Appended Text");
        out.close();

        // Delete a file
        File file = new File("helloworld.txt");
        if (file.delete()) {
            System.out.println("File Successfully deleted!");
        } else {
            System.out.println("File Not deleted!");
        }
    }
}
