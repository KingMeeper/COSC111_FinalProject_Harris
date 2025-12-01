
import java.io.*;

public class WriteFileDemo {

    public static void main(String[] args) throws IOException {
       
            PrintWriter writer = new PrintWriter("input.txt");
            writer.println("Hello");  // System.out.println vs. writer.println()
            writer.println("Writing from Java is easy!");
            writer.close(); // Why do we need to call close()?

            System.out.println("File written successfully.");
        

    }
}
