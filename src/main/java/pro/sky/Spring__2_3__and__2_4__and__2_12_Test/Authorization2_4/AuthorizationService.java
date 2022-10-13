package pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Authorization2_4;

import org.springframework.stereotype.Service;
import pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Authorization2_4.exception.WrongLoginException;
import pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Authorization2_4.exception.WrongPasswordException;


@Service
public class AuthorizationService {
    public String verification(String login, String password, String confirmPassword) {
        try {
            if (login == null) {
                return String.valueOf(false);
            } else if (login.length() >= 20) {
                throw new WrongLoginException();
            }
            for (int i = 0; i < login.length(); i++) {
                char c = login.charAt(i);
                if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '1' && c <= '9') && !(c == '_')) {
                    return String.valueOf(false);
                }
            }
            if (password == null) {
                return String.valueOf(false);
            } else if (password.length() >= 20) {
                throw new WrongPasswordException();
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '1' && c <= '9') && !(c == '_')) {
                    return String.valueOf(false);
                }
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            return String.valueOf(false);
        }


        return String.valueOf(true);
    }
}
