package com.edilson.huaman.studentapiflutter.models;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String carrera;

    @Column(nullable = false)
    private int ciclo;

    @Column(nullable = false)
    private String cursoFavorito;

    // Constructores

    public Student() {
    }

    public Student(String nombre, String carrera, int ciclo, String cursoFavorito) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.ciclo = ciclo;
        this.cursoFavorito = cursoFavorito;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getCursoFavorito() {
        return cursoFavorito;
    }

    public void setCursoFavorito(String cursoFavorito) {
        this.cursoFavorito = cursoFavorito;
    }
}