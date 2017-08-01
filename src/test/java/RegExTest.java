import org.junit.Test;

import static org.junit.Assert.*;
import static controller.utils.RegEx.*;
/**
 * Created by denglob on 8/1/17.
 */
public class RegExTest {

    @Test
    public void firstNameRightValueTest(){
        String name = "Denys";
        boolean expected = true;
        boolean actual = name.matches(FIRST_NAME);
        assertEquals(expected, actual);
    }

    @Test
    public void firstNameSmallFirstLetterTest(){
        String name = "denys";
        boolean expected = false;
        boolean actual = name.matches(FIRST_NAME);
        assertEquals(expected, actual);
    }

    @Test
    public void firstNameLargeLetterInMiddleTest(){
        String name = "DeNys";
        boolean expected = false;
        boolean actual = name.matches(FIRST_NAME);
        assertEquals(expected, actual);
    }

    @Test
    public void lastNameRightValueTest(){
        String name = "Smishny";
        boolean expected = true;
        boolean actual = name.matches(SECOND_NAME);
        assertEquals(expected, actual);
    }

    @Test
    public void lastNameSmallFirstLetterTest(){
        String name = "smishny";
        boolean expected = false;
        boolean actual = name.matches(SECOND_NAME);
        assertEquals(expected, actual);
    }

    @Test
    public void lastNamуLargeLetterInMiddleTest(){
        String name = "SmiShny";
        boolean expected = false;
        boolean actual = name.matches(SECOND_NAME);
        assertEquals(expected, actual);
    }

    @Test
    public void cityRightValueTest(){
        String city = "Khmelnitskui";
        boolean expected = true;
        boolean actual = city.matches(CITY);
        assertEquals(expected, actual);
    }

    @Test
    public void cityTestSmallFirstLetter(){
        String city = "khmelnitskui";
        boolean expected = false;
        boolean actual = city.matches(CITY);
        assertEquals(expected, actual);
    }

    @Test
    public void cityLargeLetterInMiddleTest(){
        String city = "KhmelnItSkui";
        boolean expected = false;
        boolean actual = city.matches(CITY);
        assertEquals(expected, actual);
    }

    @Test
    public void streetRightValueTest(){
        String street = "Remennogo";
        boolean expected = true;
        boolean actual = street.matches(STREET);
        assertEquals(expected, actual);
    }

    @Test
    public void streetSmallFirstLetterTest(){
        String street = "remennogo";
        boolean expected = false;
        boolean actual = street.matches(STREET);
        assertEquals(expected, actual);
    }

    @Test
    public void streetLargeLetterInMiddleTest(){
        String street = "ReMmMennogo";
        boolean expected = false;
        boolean actual = street.matches(STREET);
        assertEquals(expected, actual);
    }

    @Test
    public void emailRightValueTest(){
        String email = "den@gmail.com";
        boolean expected = true;
        boolean actual = email.matches(EMAIL);
        assertEquals(expected, actual);
    }

    @Test
    public void emailWithoutPrefixTest(){
        String email = "@gmail.com";
        boolean expected = false;
        boolean actual = email.matches(EMAIL);
        assertEquals(expected, actual);
    }

    @Test
    public void emailWithoutDotTest(){
        String email = "den@com";
        boolean expected = false;
        boolean actual = email.matches(EMAIL);
        assertEquals(expected, actual);
    }

    @Test
    public void emailWithoutSuffixAfterDotTest(){
        String email = "den@com.";
        boolean expected = false;
        boolean actual = email.matches(EMAIL);
        assertEquals(expected, actual);
    }

    @Test
    public void roomNumberRightValueTest(){
        String num = "8";
        boolean expected = true;
        boolean actual = num.matches(ROOM_NUMBER);
        assertEquals(expected, actual);
    }

    @Test
    public void roomNumberNegativeNumberTest(){
        String num = "-1";
        boolean expected = false;
        boolean actual = num.matches(ROOM_NUMBER);
        assertEquals(expected, actual);
    }

    @Test
    public void roomNumberRealNumberTest(){
        String num = "5.0";
        boolean expected = false;
        boolean actual = num.matches(ROOM_NUMBER);
        assertEquals(expected, actual);
    }

    @Test
    public void roomNumberStringTest(){
        String num = "Some sentence";
        boolean expected = false;
        boolean actual = num.matches(ROOM_NUMBER);
        assertEquals(expected, actual);
    }

    @Test
    public void houseNumberRightValueTest(){
        String num = "8";
        boolean expected = true;
        boolean actual = num.matches(HOME_NUMBER);
        assertEquals(expected, actual);
    }

    @Test
    public void houseNumberNegativeNumberTest(){
        String num = "-1";
        boolean expected = false;
        boolean actual = num.matches(HOME_NUMBER);
        assertEquals(expected, actual);
    }

    @Test
    public void houseNumberRealNumberTest(){
        String num = "2.0";
        boolean expected = false;
        boolean actual = num.matches(HOME_NUMBER);
        assertEquals(expected, actual);
    }

    @Test
    public void houseNumberStringTest(){
        String num = "Some sentence";
        boolean expected = false;
        boolean actual = num.matches(HOME_NUMBER);
        assertEquals(expected, actual);
    }

    @Test
    public void phoneRightValueTest(){
        String phone = "0988039226";
        boolean expected = true;
        boolean actual = phone.matches(MOBILE_PHONE);
        assertEquals(expected, actual);
    }
}
