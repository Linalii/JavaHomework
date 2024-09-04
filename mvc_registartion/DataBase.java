package ru.linali.mvc_registartion;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class DataBase {
    public static Set<User> users = new HashSet<User>();

    public static Set<User> users_group1 = new HashSet<User>();

    static {
        users_group1.add(new User("login1","12345", LocalDateTime.now(),4));
        users_group1.add(new User("login2","123456", LocalDateTime.now(),5));
        users_group1.add(new User("login3","123457", LocalDateTime.now(),3));
        users_group1.add(new User("login4","1234588", LocalDateTime.now(),5));
    }


    //при регистрации добавить инпут оценку (добавить в класс переменную для оценки)+
    //написать метод который добавт юзера если он так же не будет в списке группы 1+
    //написать метод который добавт юзера если он регистрируется не позже 12.00 дня
    //написать метод который добавт юзера если он есть в списке группа 1 и оценка  >= 4


    public static boolean addUserDoesNotExist(User user) {
       if(!users_group1.contains(user)) {
           users.add(user);
           return true;
       }
       return false;
    }
    public static boolean addUserRegUntil12(User user) {
        if(user.getRegistrationDate().getHour()<=12){
            users.add(user);
            return true;
        }
        return false;
    }
    public static boolean addUserExistGoodMark(User user) {
        if(users_group1.contains(user)&&user.getMark()>=4) {
            users.add(user);
            return true;
        }
        return false;
    }
}
