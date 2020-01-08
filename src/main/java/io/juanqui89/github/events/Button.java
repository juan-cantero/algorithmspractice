package io.juanqui89.github.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Button  {
  HashMap<String, ArrayList<Action>> actions = new HashMap<>();


  public void click() {
    actions.get("click").forEach(a -> a.play());
  }

  public void on(String event, Action action) {
    //if there exists the array it just add the element, otherway it creates the array first
    actions.computeIfAbsent(event,e -> new ArrayList<>()).add(action);

  }

  public static void main(String[] args) {
    Button b = new Button();
    b.on("click", () -> System.out.println("I'm an event"));
    b.on("click",() -> System.out.println("I like pinnaple"));
    b.click();


  }
}
