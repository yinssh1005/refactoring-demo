package u.t.t;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class BirthdayCalculatorBefore {

  // extract field
  public long getHowManyDaysFromMyNextBirthday(String myBirthdayStr) {
    // Get today's date
    LocalDate now = LocalDate.now();
    int year = now.getYear();
    // Process dates
    String myBirthDayOfCurrentYearStr = year + "-" + myBirthdayStr;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    LocalDate myBirthday = LocalDate.parse(myBirthDayOfCurrentYearStr, dateTimeFormatter);
    //Is the birth date in the past? aka. already celebrated this year.
    if (myBirthday.isBefore(now)) {
      myBirthday = myBirthday.plusYears(1);
    }
    return ChronoUnit.DAYS.between(now, myBirthday);
  }

  // extract constant
  private void validateContentSize(String content) throws Exception {
    if (content.length() < 500) {
      throw new Exception("Email content is oversize");
    }
  }

}