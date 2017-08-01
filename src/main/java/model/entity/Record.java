package model.entity;

/**
 * Created by denglob on 7/31/17.
 */
public class Record {

    private UserName userName;
    private Address address;
    private String login;
    private String email;
    private String phone;

    public Record(UserName userName,
                  Address address,
                  String login,
                  String email,
                  String phone) {
        this.userName = userName;
        this.address = address;
        this.login = login;
        this.email = email;
        this.phone = phone;
    }

    public static Record create(String firstName,
                                String lastName,
                                String city,
                                String street,
                                String houseNumber,
                                String roomNumber,
                                String login,
                                String email,
                                String phone) {
        return new Record(new UserName(firstName, lastName),
                new Address(city, street, houseNumber, roomNumber),
                login, email, phone);
    }

    public UserName getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Record{" +
                "userName=" + userName +
                ", address=" + address +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
