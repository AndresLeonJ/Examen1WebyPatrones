/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cinelitas.service;

import com.cinelitas.entity.Pelicula;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres
 */
@Service
public interface IPeliculaService {
    public List <Pelicula> getAllPelicula();
    public Pelicula getPeliculaById(long id);
    public void savePelicula(Pelicula pelicula);
    public void delete (long id);
}
