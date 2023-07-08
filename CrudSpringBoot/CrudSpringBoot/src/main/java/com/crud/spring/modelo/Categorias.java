package com.crud.spring.modelo;
//nombre
// cuido, asesorios ,ropa
import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Categorias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombreCategoria",nullable = false,length = 20)
    private String nombreCategoria;

    public Categorias() {
    }

    public Categorias(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Categorias(Long id, String nombreCategoria) {
        this.id = id;
        this.nombreCategoria = nombreCategoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
