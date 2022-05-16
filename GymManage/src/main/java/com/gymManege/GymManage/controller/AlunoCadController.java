package com.gymManege.GymManage.controller;

import com.gymManege.GymManage.models.AlunoCadModels;
import com.gymManege.GymManage.repository.AlunoCadRepository;
import com.gymManege.GymManage.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlunoCadController {

    @Autowired
    private AlunoCadRepository ar;

    @GetMapping("/aluno_cadastro")
    public ModelAndView list_alunos(Model model){
        ModelAndView mv = new ModelAndView("home/Aplication/alunoCadastro");
        Iterable<AlunoCadModels> alunoList= ar.findAll();
        mv.addObject("alunoList", alunoList);
        return mv;
    }

    @RequestMapping(value = "/aluno_cadastro", method = RequestMethod.POST)
    public String form(AlunoCadModels alunoCad){
        ar.save(alunoCad);
        System.out.println(alunoCad.getAltura());
        System.out.println(alunoCad.getCpf());
        System.out.println(alunoCad.getDropvalue());
        System.out.println(alunoCad.getEmail());
        System.out.println(alunoCad.getSobrenome());
        System.out.println(alunoCad.getPeso());
        System.out.println(alunoCad.getTurma());

        System.out.println(alunoCad.getTelefone());
        return  "redirect:/aluno_cadastro";
    }





}


