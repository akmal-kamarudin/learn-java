package part46;

import java.io.FileWriter;

public class JavaFileWriter {
  public static void main(String[] args) {

    try {
      FileWriter writer = new FileWriter("part46/poem.txt");
      writer.write("Roses are red, \n Violets are blue \n Rock n Roll");
      writer.append("\n (A poem by Akmal)");
      writer.close();

    } catch (Exception e) {
      // TODO: handle exception
    } finally {

    }
  }
}
