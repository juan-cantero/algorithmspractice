package io.juanqui89.github.vowels;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

import static io.juanqui89.github.vowels.VowelCounter.countVowels;

public class VowelCounterTest {

  @Test
  public void testCountVowels() {
    long expected = countVowels("aeIou");
    assertEquals(expected,5);
  }
  @Test
  public void testCountVowels2() {
    long expected = countVowels("bbbbhhhhggggg");
    assertEquals(expected,0);
  }
}