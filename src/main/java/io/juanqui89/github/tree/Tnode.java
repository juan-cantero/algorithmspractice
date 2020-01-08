package io.juanqui89.github.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tnode<E> {
  private E data;
  private List<Tnode> children;

  public Tnode() {
    children = new ArrayList<>();
  }

  public Tnode(E e) {
    data = e;
    children = new ArrayList<>();
  }

  public E getData(){ return data;}

  public void add(E e) {
    children.add(new Tnode(e));
  }

  public void remove(E e) {
       children = getChildren().stream()
            .filter(element -> element.data != e)
             .collect(Collectors.toList());
       children.forEach(c -> System.out.println(c.data));
  }

  public List<Tnode> getChildren() {
    return children;
  }
}
