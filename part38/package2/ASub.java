package part38.package2;

import part38.package1.*;

// public: visible in all classes in all packages
// protected: visible to all classes in the same package or classes in other packages that are a subclass
// default: visible to all classes in the same package 
// private: visible only in the same class

public class ASub extends A {

  public static void main(String[] args) {

    // C c = new C();
    // System.out.println(c.defaultMessage); // using default access mod, can access
    // in same package

    // System.out.println(c.publicMessage);

    ASub asub = new ASub();
    System.out.println(asub.protectedMessage);

  }
}
