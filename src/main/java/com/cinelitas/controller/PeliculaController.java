/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.controller;

import com.cinelitas.entity.Pelicula;
import com.cinelitas.entity.Sala;
import com.cinelitas.service.IPeliculaService;
import com.cinelitas.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Andres
 */
@Controller
public class PeliculaController {
    
    @Autowired
    private IPeliculaService peliculaService;

    @Autowired
    private ISalaService salaService;
    
    @GetMapping("/pelicula")
    public String index(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        model.addAttribute("titulo", "Nuestras Peliculas");
        model.addAttribute("Pelicula", listaPelicula);
        return "pelicula";

    }

    @GetMapping("/peliculaN")
    public String crearPersona(Model model) {
        List<Sala> listaSala = salaService.listSala();
        model.addAttribute("persona", new Pelicula());
        model.addAttribute("sala", listaSala);
        return "crear";

    }

    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Pelicula pelicula) {
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
    }

    @GetMapping("/editPelicula/{id}")
    public String editPersona(@PathVariable("id")Long id, Model model){
        Pelicula pelicula = peliculaService.getPeliculaById(id);
        List<Sala> listaSala = salaService.listSala();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("salas", listaSala);
        return "crear";
    }
}

