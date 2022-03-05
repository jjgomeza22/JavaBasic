package model;

/**
 * Descripción: Clase contenedora de notificaciones.
 * @author Juan José Gómez A
 * @version 1.0
 */
public class Notificacion {
    //Atributos
    private int notificacionID;
    private String titulo;
    private String descripcion;

    //Constructor
    public Notificacion(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
}
