package io.security.corespringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) throws Exception {
        model.addAttribute("testStr", "타임리프 사용");
        return "home";
    }

}
