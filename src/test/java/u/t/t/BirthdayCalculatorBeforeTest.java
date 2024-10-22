package u.t.t;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayCalculatorBeforeTest {

  @org.junit.jupiter.api.Test
  void getHowManyDaysFromMyNextBirthday() {
    BirthdayCalculatorBefore birthdayCalculator = new BirthdayCalculatorBefore();
    System.out.println(birthdayCalculator.getHowManyDaysFromMyNextBirthday("08-27"));
  }
}