package org.example;

public class NODO
{
    //Variables
    String nombre; String artista; String genero; int duracion; NODO enlace;

    //Constructor
    public NODO(String nombre, String artista, String genero, int duracion)
    {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.enlace = null;
    }


}
