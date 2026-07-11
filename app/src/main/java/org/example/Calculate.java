package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int getIndividualFee(int age) {
    int money = 0;
    if (age <= 12) {
      money = 1000;
    } else {
      money = 2000;
    }
    return money;
  }

  public int getTotalFee(int age, int groupSize) {
    int total = 0;
    if (groupSize < 10) {
      total = getIndividualFee(age) * groupSize;
    } else {
      total = getIndividualFee(age) * groupSize * 9 / 10;
    }
    return total;
  }

}
