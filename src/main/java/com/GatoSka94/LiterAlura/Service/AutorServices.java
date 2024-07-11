package com.GatoSka94.LiterAlura.Service;

import com.GatoSka94.LiterAlura.Models.Autor;
import com.GatoSka94.LiterAlura.Repositorio.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AutorServices {

    @Autowired
    private AutorRepository autorRepository;



    public List<Autor> getAutoresVivosPorAno(int year) {
        return autorRepository.findAutorByFecha(year);
    }


}
