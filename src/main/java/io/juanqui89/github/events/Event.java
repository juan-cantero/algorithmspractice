package io.juanqui89.github.events;

public interface Event {
  void click();
  void on(String event, Action action);

}
