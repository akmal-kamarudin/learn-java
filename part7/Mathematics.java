package part7;

import java.util.Scanner;

public class Mathematics {

  public static void main(String[] args) {

    double x = 3.14;
    double y = -10;

    double z = Math.max(x, y);
    double zz = Math.abs(y); // number without (-) sign
    double zzz = Math.sqrt(-y); // square root, (+) numbers only
    double zzzz = Math.round(x); // round numbers
    double a = Math.ceil(x); // always round up
    double aa = Math.floor(x); // always round up

    System.out.println(z);
    System.out.println(zz);
    System.out.println(zzz);
    System.out.println(zzzz);
    System.out.println(a);
    System.out.println(aa);

    double i;
    double j;
    double k;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter side i: ");
    i = scanner.nextDouble();
    System.out.println("Enter side j: ");
    j = scanner.nextDouble();

    k = Math.sqrt((i * i) + (j * j));

    System.out.println("The hypotenuse is: " + k);

    scanner.close();

  }
}
