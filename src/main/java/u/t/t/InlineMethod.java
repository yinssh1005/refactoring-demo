package u.t.t;

public class InlineMethod {

  public void method() {
    int a = 0;
    int b = 0;
    int c = add(a, b);
    int d = add(a, c);
  }

  private int add(int a, int b) {
    return a + b;
  }
}
