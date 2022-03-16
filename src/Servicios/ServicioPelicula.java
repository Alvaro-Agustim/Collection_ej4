/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Pelicula altaPeliculas() {
        Pelicula p1 = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula");
        p1.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        p1.setAutor(leer.next());
        System.out.println("Ingrese la duracion");
        p1.setDuracion(leer.nextDouble());
        return p1;
    }

    public void ListaPeliculas() {
        String respuesta;
        ArrayList<Pelicula> peliculas = new ArrayList();
        peliculas.add(altaPeliculas());

        while (true) {
            System.out.println("Desea agregar otra pelicula?");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("No") || respuesta.equalsIgnoreCase("n")) {
                break;
            } else if (respuesta.equalsIgnoreCase("Si") || respuesta.equalsIgnoreCase("s")) {
                peliculas.add(altaPeliculas());
            } else {
                System.out.println("Debe ingresar si o no");
            }

        }
        ListarPeliculas(peliculas);
    }

    private void ListarPeliculas(ArrayList<Pelicula> peliculas) {

        for (Pelicula peli : peliculas) {
            System.out.println(peli.getTitulo());
        }
        /*for (Pelicula peli : peliculas) {
            if (peli.getDuracion() > 1.0) {
                System.out.println(peli.getTitulo());
            }
        }*/
        Collections.sort(peliculas, Collections.reverseOrder(new SortPorDuracion()));

        for (Pelicula peli : peliculas) {
            System.out.println(peli.getTitulo());
        }
        Collections.sort(peliculas, new SortPorDuracion());
        for (Pelicula peli : peliculas) {
            System.out.println(peli.getTitulo());
        }
        Collections.sort(peliculas, new SortPorTitulo());
        for (Pelicula peli : peliculas) {
            System.out.println(peli.getTitulo());
        }
        Collections.sort(peliculas, new SortPorAutor());
        for (Pelicula peli : peliculas) {
            System.out.println(peli.getTitulo());
        }
    }

}

class SortPorDuracion implements Comparator<Pelicula> {

    public int compare(Pelicula a, Pelicula b) {
        return (Double.compare(a.getDuracion(), b.getDuracion()));
    }
}

class SortPorTitulo implements Comparator<Pelicula> {

    public int compare(Pelicula a, Pelicula b) {
        return a.getTitulo().compareTo(b.getTitulo());
    }
}
class SortPorAutor implements Comparator<Pelicula> {

    public int compare(Pelicula a, Pelicula b) {
        return a.getAutor().compareTo(b.getAutor());
    }
}