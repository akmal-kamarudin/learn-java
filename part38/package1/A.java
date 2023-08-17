package part38.package1;

import part38.package2.*;

// public: visible in all classes in all packages
// protected: visible to all classes in the same package or classes in other packages that are a subclass
// default: visible to all classes in the same package 
// private: visible only in the same class

public class A {

  protected String protectedMessage = "This is protected";

  public static void main(String[] args) {

    C c = new C(); // cannot instantiate class C bcs not public

    System.out.println(c.defaultMessage); // using default access mod, bcs different package

    System.out.println(c.publicMessage); // using public acccess mod, can access even diff package

    B b = new B();
    System.out.println(b.privateMessage); // using private access mod, cannot acccess because not in same class.
  }
}
