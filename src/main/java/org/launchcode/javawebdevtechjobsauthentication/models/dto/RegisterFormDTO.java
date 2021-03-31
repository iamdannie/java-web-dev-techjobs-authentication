package org.launchcode.javawebdevtechjobsauthentication.models.dto;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class RegisterFormDTO extends LoginFormDTO {

        private String verifyPassword;

        public String getVerifyPassword() {
            return verifyPassword;
        }

        public void setVerifyPassword(String verifyPassword) {
            this.verifyPassword = verifyPassword;
        }

        @GetMapping("/register")
        public String displayRegistrationForm(Model model) {
            model.addAttribute(new RegisterFormDTO());
            model.addAttribute("title", "Register");
            return "register";
        }
}
