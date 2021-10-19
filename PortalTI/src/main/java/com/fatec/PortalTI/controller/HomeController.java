package com.fatec.PortalTI.controller;

import com.fatec.PortalTI.Repository.ChamadoRepository;
import com.fatec.PortalTI.Service.ChamadoService;
import com.fatec.PortalTI.Service.ChamadoServiceI;
import com.fatec.PortalTI.model.Chamado;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
   @Autowired
   private ChamadoServiceI chamadoServiceI;

    @GetMapping("/")
    public ModelAndView menu() {
        return new ModelAndView("paginaMenu");
    }

    @GetMapping("/AbrirChamados")
    public ModelAndView chamados() {
        return new ModelAndView("paginaChamados");
    }

    @PostMapping("/Chamado")
    public ModelAndView salvarChamado(@RequestBody Chamado chamado, BindingResult result) {
        if (result.hasErrors()) {
            return new ModelAndView("paginaChamados");
        }
        chamadoServiceI.saveChamado(chamado);
        return new ModelAndView("home");
    }
}
