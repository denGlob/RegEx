package controller.utils;

import model.entity.Record;
import view.View;

import java.util.Scanner;

import static controller.utils.RegEx.*;

/**
 * Created by denglob on 7/31/17.
 */
public class RecordInputController {
    private Scanner sc;
    private View view;

    private String firstName;
    private String lastName;

    private String login;

    private String email;
    private String phone;

    private String city;
    private String street;
    private String houseNumber;
    private String roomNumber;

    private Record record;


    public RecordInputController(Scanner scanner, View view) {
        this.sc = scanner;
        this.view = view;
    }

    public Record createRecord() {
        if (record == null) {

            view.printInputFirstNameMessages();
            firstName = inputData(FIRST_NAME);

            view.printInputLastNameMessages();
            lastName = inputData(SECOND_NAME);

            view.printInputLoginMessages();
            login = inputData(LOGIN);

            view.printInputEmailMessages();
            email = inputData(EMAIL);

            view.printInputPhoneMessages();
            phone = inputData(MOBILE_PHONE);

            view.printInputCityMessages();
            city = inputData(CITY);

            view.printInputStreetMessages();
            street = inputData(STREET);

            view.printInputHouseNumberMessages();
            houseNumber = inputData(HOME_NUMBER);

            view.printInputAppartmentNumberMessages();
            roomNumber = inputData(ROOM_NUMBER);

            record = Record.create(firstName, lastName, login, email, phone, city, street, houseNumber, roomNumber);
        }

        return record;
    }

    private String inputData(String regex) {
        String res = "";
        while(!(sc.hasNextLine() && checkInputString(res=sc.nextLine(), regex))){
            view.printWrongInputMessages();
        }
        return res;
    }

    public boolean checkInputString(String str, String regex){
        return str.matches(regex);
    }


    public void inputNewLogin() {
        view.printWrongLoginMessages();
        view.printInputLoginMessages();
        login = inputData(LOGIN);
        record.setLogin(login);
    }
}
