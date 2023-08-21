package part47;

import java.io.FileReader;

public class JavaFileReader {

  public static void main(String[] args) {

    // FileReader = read the contents of a file as a stream of characters.
    // read() returns an int value which contains the byte value
    // when read() returns -1, there is no more data to be read

    try {
      FileReader reader = new FileReader("part47/art.txt");
      int data = reader.read();
      while (data != -1) {
        System.out.print((char) data);
        data = reader.read();
      }
      reader.close();

    } catch (Exception e) {
      // TODO: handle exception

    }
  }
}
