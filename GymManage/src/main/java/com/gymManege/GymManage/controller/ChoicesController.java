package com.gymManege.GymManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChoicesController {
    @GetMapping("/escolhas")
    public String index(Model model){
        model.addAttribute("name","Gabs");
        return "home/Aplication/choices";
    }
    @GetMapping("/operaraluno")
    public String operaraluno(Model model){
        model.addAttribute("name","Gabs");
        return "home/Aplication/Operaluno";
    }
    @GetMapping("/operarprofessor")
    public String operarprofessor(Model model){
        model.addAttribute("name","Gabs");
        return "home/Aplication/Operprofessor";
    }

    @GetMapping("/operarficha")
    public String operarficha(Model model){
        model.addAttribute("name","Gabs");
        return "home/Aplication/Operficha";
    }




}