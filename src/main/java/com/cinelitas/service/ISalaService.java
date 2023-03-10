/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cinelitas.service;

import com.cinelitas.entity.Pelicula;
import com.cinelitas.entity.Sala;
import java.util.List;

/**
 *
 * @author Andres
 */
public interface ISalaService {
    public List<Sala> listSala();

    public List<Pelicula> getAllPelicula();
    
}
