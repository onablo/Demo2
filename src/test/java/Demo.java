import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo {

    @Test
    public void testasIfNumber4Even(){

        // Duomenys
        int input = 4;
        int actualRemainder;
        int expectedRemainder = 0;

        // Testo veiksmai
        actualRemainder = input % 2;

        //Palyginimas
        Assert.assertEquals(actualRemainder, expectedRemainder);

    }

    @Test
    public void testIfTimeNowIs19Hours() {

        // Duomenys
        int expectedHour = 19;
        LocalDateTime actualDateTime = LocalDateTime.now();

        // Testo veiksmai
        int actualHour = actualDateTime.getHour();

        //Palyginimas
        Assert.assertEquals(expectedHour, actualHour, "Expected: " + expectedHour + " , actual: " + actualHour);
    }
}

