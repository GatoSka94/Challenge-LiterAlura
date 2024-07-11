package com.GatoSka94.LiterAlura.dto;


import com.GatoSka94.LiterAlura.Models.Autor;


public record LibroDTO(int idLibro,
                       String titulo,
                       Autor autor,
                       String idioma,
                       int numeroDeDescargas
) {
}
