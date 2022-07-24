import java.util.*;
import java.io.*;

public class DeleteFile {
    public static void main(String[] args) throws Exception {
        File file = new File("helloworld.txt");
        if (file.delete()) {
            System.out.println("File Successfully deleted!");
        } else {
            System.out.println("File Not deleted!");
        }
    }
}
