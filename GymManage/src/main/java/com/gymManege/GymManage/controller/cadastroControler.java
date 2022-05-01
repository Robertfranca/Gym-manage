package com.gymManege.GymManage.controller;

import com.gymManege.GymManage.models.cadAluno;
import com.gymManege.GymManage.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class cadastroControler {


    @Autowired
    private Repository er;

    @RequestMapping(value="/cadastro", method = RequestMethod.GET )
    public String CadGeren (Model model){
        model.addAttribute("name","Gabs");
        return "home/Cadastro/cadastro";
    }

    @RequestMapping(value="/cadastro", method = RequestMethod.GET )
    public String CadGeren (cadAluno cad){

        return "home/Cadastro/cadastro";
    }

}
