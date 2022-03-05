package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Descripción: Clase para la creación de clientes en la plataforma.
 * @author Juan José Gómez A
 * @version 1.0
 */
public class Cliente extends Usuario {
    //Atributos
    private ArrayList<Cliente.NuevoServicio> serviciosPropuestos = new ArrayList<>();
    private ArrayList<Servicio> serviciosSolicitados = new ArrayList<>();

    //Constructor
    public Cliente(String nombre, String nombreUsuario, String apellido, String email,
            String numeroContacto, String direccion, String contrasena){

        super(nombre, nombreUsuario, apellido, email, numeroContacto,
              direccion, contrasena);
    }

    //Metodos
    /**
     * Descripción: Este método permitirá al cliente realizar la solicitud de un servicio.
     * @return void
     */
    public void solicitarServicio(String nombre, String descripcion, String direccion, Date fecha){
        serviciosSolicitados.add(new Servicio(nombre, descripcion, direccion, fecha));

    }
    /**
     * Descripción: Este método permitirá mostrar los servicios solicitados por el cliente
     * se implento con el fin de corroborar que la clase Servicio funcionara correctamente.
     * @return void
     */
    public void mostrarServicios(){
        for (int i = 0; i < serviciosSolicitados.size(); i++) {
            System.out.println(serviciosSolicitados.get(i));
        }
    }
    /**
     * Descripción: Este método permitirá mostrar los servicios solicitados por el cliente
     * se implento con el fin de corroborar que la clase NuevoServicio funcionara correctamente.
     * @return void
     */
    public void mostrarNuevosServicios(){
        for (int i = 0; i < serviciosPropuestos.size(); i++) {
            System.out.println(serviciosPropuestos.get(i));
        }
    }
    /**
     * Descripción: Este método le permitirá al cliente proponer un nuevo servicio
     * si el que requiere no se encuentre disponible en la plataforma.
     * @return void
     */
    public void proponerServicio(String nombre, String descripcion){
        serviciosPropuestos.add(new Cliente.NuevoServicio(nombre, descripcion));
    }
    /**
     * Descripción: Este método le permitirá al cliente calificar el servicio prestado
     * por un hacedor.
     * @return void
     */
    public void calificarServicio(){

    }
    /**
     * Descripción: Este método le permitirá al cliente cancelar el servicio
     * si así lo desea.
     * @return void
     */
    public void cancelarServicio(){

    }
    /**
     * Descripción: Clase interna de la clase Cliente, con el fin de que el cliente
     * pueda proponer nuevos servicios que no estén disponibles en la plataforma.
     * @author Juan José Gómez A
     * @version 1.0
     */
    //Clase NuevoServicio
    public static class NuevoServicio{
        //Atributos
        private int nuevoServicioID;
        private String nombre;
        private String descripcion;
        private boolean aprobacion;
        private Notificacion notificacion;

        //Constructor
        public NuevoServicio(String nombre, String descripcion){
            this.nombre = nombre;
            this.descripcion = descripcion;
        }

        //Metodos
        /**
         * Descripción: Este método generará una notificación una vez se solicite un nuevo
         * servicio.
         * @return void
         */
        public void generarNotificacion(String titulo, String descripcion){
            notificacion = new Notificacion(titulo, descripcion);
        }
        @Override
        public String toString() {
            return "Nuevo Servicio numero: "+ nuevoServicioID + "\n" +
                    "Nombre: " + nombre + "\n" +
                    "Descripcion: " + descripcion + ".\n";
        }
    }
}
