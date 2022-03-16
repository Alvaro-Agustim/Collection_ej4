/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author alvaro
 */
public class Pelicula {

    private String titulo;
    private String autor;
    private double duracion;

    public Pelicula(String titulo, String autor, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return '{' + "Titulo: " + titulo + ", Autor: " + autor + ", Duracion: " + duracion + '}';
    }
    
    
    
}
