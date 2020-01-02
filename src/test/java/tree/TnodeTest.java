package tree;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.testng.Assert.*;

public class TnodeTest {
  Tnode<Integer> node;

  @BeforeMethod
  public void setUp() {
    node = new Tnode<>();
    node.add(4);
    node.add(5);
    node.add(10);
    node.add(8);
    node.add(10);
  }

  @Test
  public void testAdd() {
    int expectedSize = node.getChildren().size();
    assertEquals(expectedSize, 1);
  }

  @Test
  public void testRemove() {
    node.remove(10);
    List<Integer> expected = node.getChildren().stream()
            .mapToInt(e -> (int) e.getData())
            .boxed().collect(Collectors.toList());
    assertEquals(expected, Arrays.asList(4,5,8));
  }
}