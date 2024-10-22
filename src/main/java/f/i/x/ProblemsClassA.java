package f.i.x;

public class ProblemsClassA {

  private void autoReplaceNullCheck(Foo x) {
    if (!(x instanceof Foo)) {
      System.out.println("null");
    }
  }

  private void autoCheck(Foo x) {
    if (!(x instanceof Foo)) {
      System.out.println("null");
    }
  }

  private void autoVerify(Foo x) {
    if (!(x instanceof Foo)) {
      System.out.println("null");
    }
  }
}

class Foo {}