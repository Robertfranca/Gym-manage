package com.gymManege.GymManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cadastroControler {

    @GetMapping("/cadastro")

    public String CadGeren (Model model){
        model.addAttribute("name","Gabs");
        return "home/Cadastro/cadastro";

    }

}
