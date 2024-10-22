package u.t.t;

import java.util.LinkedList;
import java.util.List;

// right-click -> refactor -> Convert Raw Types to Generics
public class RawTypeRefactoring {
  public void method() {
    List list = new LinkedList();
    list.add("string");
  }
}
