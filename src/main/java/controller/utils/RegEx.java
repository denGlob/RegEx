package controller.utils;

/**
 * Created by denglob on 7/31/17.
 */
public interface RegEx {

    String FIRST_NAME = "[A-Z]{1}[a-z]{1,20}";
    String SECOND_NAME = "[A-Z]{1}[a-z]{1,20}";

    String LOGIN = "[A-Za-z0-9]{1,20}";

    String MOBILE_PHONE = "\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})";

    String EMAIL = "\\w+@[A-Za-z0-9]+\\.[A-Za-z]{2,64}";

    String CITY = "[A-Z]{1}[a-z]+";
    String STREET = "[A-Z]{1}[a-z]+";
    String HOME_NUMBER = "\\d+";
    String ROOM_NUMBER = "\\d+";

}
