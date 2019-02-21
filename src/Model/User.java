package Model;

import java.time.LocalDateTime;

public class User {
    private String login;
    private String password;
    private LocalDateTime registration_date;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.registration_date = LocalDateTime.now();
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegistration_date(LocalDateTime registration_date) {
        this.registration_date = registration_date;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime getRegistration_date() {
        return registration_date;
    }

    @Override
    public String toString() {
        return "User{ login='" + login + ", password=" + password + ", registration_date=" + registration_date + '}';
    }
}
