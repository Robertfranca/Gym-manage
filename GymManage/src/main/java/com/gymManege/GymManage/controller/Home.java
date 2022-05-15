package com.gymManege.GymManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name","Gabs");
        return "home/index";
    }

    @GetMapping("/contato")
    public String contato(Model model){
        model.addAttribute("name","Gabs");
        return "home/contato";
    }
    @GetMapping("/sobre")
    public String sobre(Model model){
        model.addAttribute("name","Gabs");
        return "home/sobre";
    }
    @GetMapping("/parcerias")
    public String parcerias(Model model){
        model.addAttribute("name","Gabs");
        return "home/Parcerias";
    }



}
