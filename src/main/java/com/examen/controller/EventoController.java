package com.examen.controller;


import com.examen.entity.Evento;
import com.examen.service.iEventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventoController {
    
    @Autowired
    private iEventoService EventoService;
    
    @GetMapping("/evento")
    public String index(Model model){
        List<Evento> listaEvento=EventoService.getAllPerson();
        model.addAttribute("titulo", "Evento");
        model.addAttribute("evento",listaEvento);
        return "evento";
    }
    @GetMapping ("/eventoN")
    public String crearEvento(Model model){
        model.addAttribute("evento", new Evento());
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarEvento(@ModelAttribute Evento evento){
        EventoService.saveEvento(evento);
        return "redirect:/evento";
    }
    @GetMapping("/delete/{id}")
    public String eliminarEvento(@PathVariable("id")Long idEvento){
        EventoService.delete(idEvento);
        return "redirect:/evento";
    }

}
