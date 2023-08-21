package part45;

// JAVA file Class
import java.io.File;

public class FileClass {
  public static void main(String[] args) {

    // file = an abstract representation of file and directory pathnames

    // make sure to put the extension and also a full file directory
    File file = new File("part45/secret_message.txt");

    if (file.exists()) {
      System.out.println("That file exists! :O");
      System.out.println(file.getPath()); // get path
      System.out.println(file.getAbsolutePath()); // get full path
      System.out.println(file.isFile()); // check file or folder
      file.delete(); // this will delete the file

    } else {
      System.out.println("That file doesn't exist :(");
    }
  }
}