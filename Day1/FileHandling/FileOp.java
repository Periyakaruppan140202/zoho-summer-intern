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
        System.out.println("Enter the text to append in the file: ");
        Scanner sck = new Scanner(System.in);
        String x = sck.nextLine();

        // Append More text to existing file
        BufferedWriter out = new BufferedWriter(new FileWriter("helloworld.txt",
                true));
        out.write("\nAppended Text: ");
        out.write(x);
        out.close();
        sc = new Scanner(new File("helloworld.txt"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

    }
}
