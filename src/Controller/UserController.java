package Controller;

import Model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class UserController {
    public List<User> registered_users = new ArrayList<>();
    Set<String> registered_logins = new HashSet<>();
    public boolean addNewUser(String login, String password) {
        if (registered_logins.contains(login)) {
            System.out.println("Użytkowniki o podanym loginie już istnieje!");
            return false;
        }
        if (!passwordCheck(password)){
            System.out.println("Hasło nie spełnia wymagań.");
            return false;
        }

        User u = new User(login, password);
        // System.out.println("Zarejestrowano użytkownika.   " + login);
        registered_users.add(u);
        registered_logins.add(login);
        return true;

    }
    public boolean passwordCheck(String newPassword) {

        //pattern na długość znaku
        String pattern = ".{6,32}";
        //musi być jedna cyfra
        String pattern1 = ".*\\d+.*";
        //musi być jedna WIELKA LITERA
        String pattern2 = ".*[A-Z]+.*";

        return Pattern.matches(pattern, newPassword) &&Pattern.matches(pattern1, newPassword) &&Pattern.matches(pattern2, newPassword)  ;
    }
    public void showAllUser() {
        for (User u : registered_users) {
            System.out.println(u);
        }
    }
    public boolean changePassword(String login, String oldPassword, String newPassword1, String newPassword2) {
        for (int i = 0; i < registered_users.size(); i++) {
            //szukamy usera po loginie;
            if (registered_users.get(i).getLogin().equals(login) && registered_users.get(i).getPassword().equals(oldPassword)) {
                //sprawdzamy podobienstwo
                if (newPassword1.equals(newPassword2) && !newPassword1.equals(oldPassword)) {
                    //sprawdzamy poprawnosc hasła
                    if (passwordCheck(newPassword1)) {
                        registered_users.get(i).setPassword(newPassword1);
                        System.out.println("Zmieniono hasło.");
                        return true;
                    }
                    System.out.println("Nowe hasło nie spełnia wymagań.");
                    return false;
                }

                System.out.println("Podane hasła różnią się lub wpisałeś stare hasło.");
                return false;
            }
        }
        System.out.println("Nie ma loginu lub błedne hasło.");
        return false;
    }
    public boolean deleteUser(String login_delete) {
        for (int i = 0; i < registered_users.size(); i++) {
            if (registered_users.get(i).getLogin().equals(login_delete)) {
                registered_users.remove((registered_users.get(i)));
                registered_logins.remove(login_delete);
                System.out.println("Usunięto użytkownika: " + login_delete);
                return true;
            }

        }
        System.out.println("Nie ma takiego użytkownika: " + login_delete);
        return false;
    }
    //zmienić po kropce? ???? W mainUser wezme uc.get(1).changePassword("DFASDF");
//    public void changePassword (String newPassword){
//
//
//    }

}
