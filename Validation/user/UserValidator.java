package user;

import static user.UserValidationExceptionMessages.BAD_EMAIL;
import static user.UserValidationExceptionMessages.BAD_PASSWORD;
import static user.UserValidationExceptionMessages.BAD_PHONE_NUMBER;

public class UserValidator implements Validator {


    @Override
    public boolean validate(Object o) throws Exception {
        if (!(o instanceof User)) return false;            // CharacterisDigit - ПОдивитись на ДЗ

        User u = (User) o;
        StringBuffer sb = new StringBuffer();

        if (u.getPassword().length()< 6){
            sb.append(BAD_PASSWORD);
            sb.append('\n');
        }
        if (!u.getEmail().contains("@")){
            sb.append(BAD_EMAIL);
            sb.append('\n');
        }

        if (!u.getPhoneNumber().startsWith("+380") && u.getPhoneNumber().length()<13){
            for (int i = 4 ; i< u.getPhoneNumber().length();i++){
                if ((int) u.getPhoneNumber().charAt(i)>=10){
                    sb.append(BAD_PHONE_NUMBER);
                    sb.append('\n');
                }
            }
        } else if (!u.getPhoneNumber().startsWith("0") && u.getPhoneNumber().length()<10){
            sb.append(BAD_PHONE_NUMBER);
            sb.append('\n');
        } else if (!u.getPhoneNumber().startsWith("380") && u.getPhoneNumber().length() == 12){
            sb.append(BAD_PHONE_NUMBER);
            sb.append('\n');
        }

        if (sb.length()>0){
            throw new UserValidationException(sb.toString());
        }

        return true;
    }
}
