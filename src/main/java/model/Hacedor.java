package model;

import java.util.ArrayList;

/**
 * Descripción: Clase para la creación de hacedores en la plataforma.
 * @author Juan José Gómez A
 * @version 1.0
 */
public class Hacedor extends Usuario{
    //Atributos
    private ArrayList<Habilidad> habilidades = new ArrayList<>();
    private boolean disponibilidad;
    private String rangoTrabajo;

    //Constructor
    public Hacedor(String nombre, String nombreUsuario, String apellido, String email,
                   String  numeroContacto, String direccion, String contrasena){

        super(nombre, nombreUsuario, apellido, email, numeroContacto,
                direccion, contrasena);
    }

    //Metodos
    /**
     * Descripción: Este método le permitirá al hacedor aceptar realizar un servicio.
     * @return void
     */
    public void aceptarServicio(){

    }
    /**
     * Descripción: Este método le permitirá al hacedor negar un servicio.
     * @return void
     */
    public void negarServicio(){

    }
    /**
     * Descripción: Este método le permitirá al hacedor agregar las habilidades
     * que se ajusten a su perfil.
     * @return void
     */
    public void agregarHabilidad(String nombre, String descripcion){
        habilidades.add(new Habilidad(nombre, descripcion));
    }
    /**
     * Descripción: Este método le permitirá al hacedor cancelar un servicio.
     * @return void
     */
    public void cancelarServicio(){

    }
    /**
     * Descripción: Este método le permitirá al hacedor actualizar el rango
     * de trabajo que esta dispuesto a visitar.
     * @return void
     */
    public void actualizarRangoTrabajo(String nuevoRangoTrabajo){
        this.rangoTrabajo = nuevoRangoTrabajo;
    }

    /**
     * Descripción: Clase interna de la clase Hacedor, la cual tiene como fin establecer las habilidades
     * que le permitiran desempeñarse en los trabajos.
     * @author Juan José Gómez A
     * @version 1.0
     */
    //Clase Habilidad
    public static class Habilidad{
        //Atributos
        private int habilidadID;
        private String nombre;
        private String descripcion;

        //Cosntructor
        public Habilidad(String nombre, String descripcion){
            this.nombre = nombre;
            this.descripcion = descripcion;
        }
    }

}
