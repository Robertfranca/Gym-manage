package com.gymManege.GymManage.controller;

import com.gymManege.GymManage.models.ProfCadModels;
import com.gymManege.GymManage.repository.ProfCadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfCadController {

    @Autowired
    private ProfCadRepository pr;

    @GetMapping("/prof_list")
    public ModelAndView list_profs(Model model){
        ModelAndView mv = new ModelAndView("home/Aplication/proflist");
        Iterable<ProfCadModels> profList= pr.findAll();
        mv.addObject("profList", profList);
        return mv;
    }
    @GetMapping("/prof_cadastro")
    public ModelAndView cadastro_profs(Model model){
        ModelAndView mv = new ModelAndView("home/Aplication/profCadastro");
        Iterable<ProfCadModels> profList= pr.findAll();
        mv.addObject("profList", profList);
        return mv;
    }



    @RequestMapping(value = "/prof_cadastro", method = RequestMethod.POST)
    public String form(ProfCadModels profCad){
        pr.save(profCad);
        return "redirect:/prof_cadastro";
    }


}


