package model;

import java.util.Date;

/**
 * Descripción: Clase para contenedora de servicio.
 * @author Juan José Gómez A
 * @version 1.0
 */
public class Servicio {
    //Atributos
    private int servicioID;
    private String nombre;
    private String descripcion;
    private String direccion;
    private boolean aceptado;
    private boolean habilitado;
    private Date fecha;
    private Notificacion notificacion;

    //Constructor
    public Servicio(String nombre, String descripcion, String direccion, Date fecha){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.fecha = fecha;
    }

    //Metodos
    /**
     * Descripción: Este método generará una notificación después de realizar la solicitud de un servicio.
     * @return void
     */
    public void generarNotificacion(String titulo, String descripcion){
        notificacion = new Notificacion(titulo, descripcion);
    }

    @Override
    public String toString() {
        return "Servicio numero: "+ servicioID + "\n" +
                "Nombre: " + nombre + "\n" +
                "Descripcion: " + descripcion + ".\n";
    }
}
