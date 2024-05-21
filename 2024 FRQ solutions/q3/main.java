import java.util.ArrayList;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> ts = new ArrayList<String>();
    ts.add("appleapp");
    ts.add("ice");
    ts.add("ce");
    WordCracker test1 = new WordCracker(ts);
    System.out.println(test1.isWordChain());
    System.out.println(test1.createList("le"));
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
