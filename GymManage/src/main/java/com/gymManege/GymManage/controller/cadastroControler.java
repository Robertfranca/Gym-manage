package com.gymManege.GymManage.controller;

import com.gymManege.GymManage.models.AlunoModels;
import com.gymManege.GymManage.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class cadastroControler {


    @Autowired
    private AlunoRepository cr;



    @RequestMapping("/cadastro")
    public ModelAndView listarAlunos(){
        ModelAndView mv = new ModelAndView("home/cadastro/Cadastro");
        Iterable<AlunoModels> aluno= cr.findAll();
        mv.addObject("aluno", aluno);
        return mv;
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST)
    public String form(AlunoModels aluno){
        cr.save(aluno);
        return  "redirect:/cadastro";
    }

}
