package user;

public class UserValidationException extends Exception {
    public UserValidationException(){
        }

    public UserValidationException(String message) {
        super(message);
    }
}
