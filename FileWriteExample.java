import java.io.*;

class FileWriteExample {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("data.txt");

        fw.write("Hello Java!");
        fw.write("\nThis is file handling.");

        fw.close();

        System.out.println("Data written successfully!");
    }
}