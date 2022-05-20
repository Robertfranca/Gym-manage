package com.gymManege.GymManage.controller;

import com.gymManege.GymManage.models.FichaCadModels;
import com.gymManege.GymManage.repository.FichaCadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FichaController {

    @Autowired
    private FichaCadRepository fr;

    @GetMapping("/ficha_list")
    public ModelAndView list_ficha(Model model){
        ModelAndView mv = new ModelAndView("home/Aplication/listarFicha");
        Iterable<FichaCadModels> FichaList= fr.findAll();
        mv.addObject("FichaList", FichaList);
        return mv;
    }

    @GetMapping("/ficha_cadastro")
    public ModelAndView cadastro_ficha(Model model){
        ModelAndView mv = new ModelAndView("home/Aplication/fichaCadastro");
        Iterable<FichaCadModels> FichaList= fr.findAll();
        mv.addObject("FichaList", FichaList);
        return mv;
    }


    @RequestMapping(value = "/ficha_cadastro", method = RequestMethod.POST)
    public String cadficha(FichaCadModels FichaList){
        fr.save(FichaList);
        System.out.println(FichaList.getId());
        return  "redirect:/ficha_list";
    }

    @RequestMapping("/deletarficha")
    public String deletar (long id){
        fr.deleteById(id);
        return "redirect:/ficha_list";
    }



}
