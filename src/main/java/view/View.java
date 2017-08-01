package view;

import static view.RegularPhrases.*;
import static util.Global.*;

/**
 * Created by denglob on 7/31/17.
 */
public class View {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concat(String ... values) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String value : values) {
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }

    public void printInputFirstNameMessages(){
        printMessage(concat(PLEASE_ENTER, SPACE, FIRST_NAME, COLON));
    }
    public void printInputLastNameMessages(){
        printMessage(concat(PLEASE_ENTER, SPACE, LAST_NAME, COLON));
    }
    public void printInputEmailMessages(){
        printMessage(concat(PLEASE_ENTER, SPACE, EMAIL, COLON));
    }
    public void printInputPhoneMessages(){
        printMessage(concat(PLEASE_ENTER, SPACE, PHONE, COLON));
    }

    public void printInputCityMessages(){
        printMessage(concat(PLEASE_ENTER, SPACE, CITY, COLON));
    }

    public void printInputStreetMessages(){
        printMessage(concat(PLEASE_ENTER, SPACE, STREET, COLON));
    }

    public void printInputAppartmentNumberMessages(){
        printMessage(concat(PLEASE_ENTER, SPACE, ROOM_NUMBER, COLON));
    }

    public void printInputHouseNumberMessages(){
        printMessage(concat(PLEASE_ENTER, SPACE, HOUSE_NUMBER, COLON));
    }

    public void printWrongInputMessages(){
        printMessage(concat(PLEASE_ENTER, SPACE, WRONG_INPUT, DOT));
    }

    public void printResultMessages(){
        printMessage(concat(RESULT, COLON));
    }

    public void printInputLoginMessages() {
        printMessage(concat(PLEASE_ENTER, SPACE, LOGIN, COLON));
    }

    public void printWrongLoginMessages() {
        printMessage(concat(WRONG_LOGIN));
    }


}
