package com.GatoSka94.LiterAlura.Repositorio;

import com.GatoSka94.LiterAlura.Models.Autor;
import com.GatoSka94.LiterAlura.Models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    List<Autor> findAutorByNombre(String nombre);


    @Query(value = "SELECT a FROM Autor a WHERE a.fechaDefuncion >:year AND a.fechaNacimiento <:year")
    List<Autor> findAutorByFecha(int year);

}