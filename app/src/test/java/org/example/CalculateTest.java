package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testGetIndividualFee_Age10() {
    Calculate calc = new Calculate();
    int expected = 1000;

    assertEquals(expected, calc.getIndividualFee(10));
  }

  @Test
  public void testGetIndividualFee_Age25_Returns2000() {
    Calculate calc = new Calculate();
    int expected = 2000;

    assertEquals(expected, calc.getIndividualFee(25));
  }

  @Test
  public void testGetTotalFee_Age10AndSize1() {
    Calculate calc = new Calculate();
    int expected = 1000;

    assertEquals(expected, calc.getTotalFee(10, 1));
  }

  @Test
  public void testGetTotalFee_Age25AndSize1() {
    Calculate calc = new Calculate();
    int expected = 2000;

    assertEquals(expected, calc.getTotalFee(25, 1));
  }

  @Test
  public void testGetTotalFee_Age10AndSize15() {
    Calculate calc = new Calculate();
    int expected = 13500;

    assertEquals(expected, calc.getTotalFee(10, 15));
  }

  @Test
  public void testGetTotalFee_Age25AndSize15() {
    Calculate calc = new Calculate();
    int expected = 27000;

    assertEquals(expected, calc.getTotalFee(25, 15));
  }
}
