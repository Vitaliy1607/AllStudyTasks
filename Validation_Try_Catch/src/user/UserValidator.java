package user;


import static user.UserValidationExceptionMessages.*;

public class UserValidator implements Validator {

    @Override
    public boolean validate(Object o) throws Exception {
        if (!(o instanceof User)) return false;

        User u = (User) o;
        StringBuffer sb = new StringBuffer();

        if (u.getPassword().length() < 6) {
            sb.append(BAD_PASSWORD);
            sb.append('\n');
        }

        if (!u.getEmail().contains("@")) {
            sb.append(BAD_EMAIL);
            sb.append('\n');
        }

        if (sb.length() > 0) {
            throw new UserValidationException(sb.toString());
        }

        return true;
    }
}
