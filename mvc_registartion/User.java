package ru.linali.mvc_registartion;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class User {
    private String username;
    private String password;
    private LocalDateTime registrationDate;
    private int mark;

    public User(String username, String password, LocalDateTime registrationDate, int mark) {
        this.username = username;
        this.password = password;
        this.registrationDate = registrationDate;
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
