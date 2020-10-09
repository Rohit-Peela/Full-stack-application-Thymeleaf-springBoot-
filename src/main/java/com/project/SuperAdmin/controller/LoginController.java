package com.project.SuperAdmin.controller;


import com.project.SuperAdmin.entity.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {

    @PostMapping("/login")
    public String getLoginForm(@ModelAttribute(name = "loginForm") LoginForm loginForm, Model model) {
        //model.addAttribute("loginForm",loginForm);

        String username = loginForm.getUsername();

        String password = loginForm.getPassword();

        if("deepak@creditsnap.com".equalsIgnoreCase(username) && "Creditsnap@123".equalsIgnoreCase(password)) {
            return "menu";
        }

        model.addAttribute("invalidCredentials", true);
        return "index";

    }
}
