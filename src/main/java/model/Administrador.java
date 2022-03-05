package model;

/**
 * Descripción: Clase para realizar mantenimiento a la plataforma.
 * @author Juan José Gómez A
 * @version 1.0
 */
public class Administrador {
    //Atributos
    private int adminID;
    private String nombreUsuario;
    private String contrasena;

    //Constructor
    public Administrador(String nombreUsuario, String contrasena){
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    //Metodos{
    /**
     * Descripción: Este método le permitirá al administrador aprobar una solicitud de un nuevo
     * servicio.
     * @return void
     */
    public void aprobarNuevoServicio(){

    }
    /**
     * Descripción: Este método le permitirá al administrador iniciar sesión en la plataforma.
     * @return void
     */
    public void iniciarSesion(){
        //Proceso de interación con la base de datos
        System.out.println("Sesión iniciada ");
    }
    /**
     * Descripción: Este método le permitirá al administrador cerrar sesión en la plataforma.
     * @return void
     */
    public void cerrarSesion(){
        //Proceso de interación con la base de datos
        System.out.println("Regresa pronto");
    }
    /**
     * Descripción: Este método le permitirá al administrador enviar una notificación a los clientes
     * indicando si su solicitud de nuevo servicio fue aprobada o no.
     * @return void
     */
    public void enviarNotificacionCliente(){

    }
    /**
     * Descripción: Este método le permitirá al administrador enviar la notificación generada
     * por un servicio a los hacedores.
     * @return void
     */
    public void enviarNotificacionHacedor(){

    }
}
