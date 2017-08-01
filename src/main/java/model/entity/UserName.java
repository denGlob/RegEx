package model.entity;

import util.Global;

/**
 * Created by denglob on 7/31/17.
 */
public class UserName {

    private String firstName;
    private String lastName;

    public UserName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstName).append(Global.SPACE).append(lastName).append(Global.DOT);
        return stringBuilder.toString();
    }
}
