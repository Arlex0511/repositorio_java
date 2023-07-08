package com.crud.spring.repositorio;

import com.crud.spring.modelo.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioCategoria extends JpaRepository<Categorias, Long> {
}
