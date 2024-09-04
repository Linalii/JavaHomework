package ru.linali.mvc_registartion;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class UserController {

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String reg() {
        return "reg";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String reg_post(
            @RequestParam String login,
            @RequestParam String password,
            @RequestParam int mark,
            Model model)
    {
        User user = new User(login, password, LocalDateTime.now(), mark);
        boolean add = DataBase.addUserExistGoodMark(user);

        if (add){
            model.addAttribute("message","Успешно добавлен");
        }else {
            model.addAttribute("message","уже есть такой");
        }

        return "reg";
    }

}
