package ru.job4j.ex;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 22.01.2020
 */

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User us : users) {
            if (us.getUsername().equals(login)) {
                user = us;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("Пользователь не найден.");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("Не валидный пользователь.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Bruki Mammad", true)
        };
        try {
            User user = findUser(users, "Bruki Mammad");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException usIE) {
            usIE.printStackTrace();
        } catch (UserNotFoundException usNFE) {
            usNFE.printStackTrace();
        }
    }
}
