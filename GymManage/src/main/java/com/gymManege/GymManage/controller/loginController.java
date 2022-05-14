package com.gymManege.GymManage.controller;

import com.gymManege.GymManage.models.AlunoModels;
import com.gymManege.GymManage.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class loginController {
    @Autowired
    private AlunoRepository cr;

    @GetMapping("/login")
    public String index(){
        return "home/login/login";
    }

//    @PostMapping("/logar")
//    public String logar(AlunoModels aluno) {
//        System.out.println(aluno.getEmaiil());
//        System.out.println(aluno.getNome());
//        if (aluno.getSenha().equals("test")) {
//            return "redirect:/";
//
//        } else {
//            return "redirect:/cadastro";
//        }
//    }
}