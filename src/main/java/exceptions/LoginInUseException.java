package exceptions;

/**
 * Created by denglob on 7/31/17.
 */
public class LoginInUseException extends Exception {

    public LoginInUseException() {
    }

    public LoginInUseException(String s) {
        super(s);
    }
}
