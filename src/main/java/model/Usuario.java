package model;

/**
 * Descripción: Clase base para la creacion de las clases Cliente y Hacedor.
 * @author Juan José Gómez A
 * @version 1.0
 */
public abstract class Usuario {
    //Atributos
    private int usuarioID;
    private String nombre;
    private String nombreUsuario;
    private String apellido;
    private String email;
    private String numeroContacto;
    private String direccion;
    private String contrasena;

    //Constructor
    public Usuario(String nombre, String nombreUsuario, String apellido, String email,
            String numeroContacto, String direccion, String contrasena){

        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.apellido = apellido;
        this.email = email;
        this.numeroContacto = numeroContacto;
        this.direccion = direccion;
        this.contrasena = contrasena;
    }

    //Metodos
    /**
     * Descripción: Este método permitirá tanto a los clientes como hacedores registarse en la plataforma.
     * @return void
     */
    public void registrarse(){
        //Proceso de interación con la base de datos
        System.out.println("Bienvenido " + nombre);
    }
    /**
     * Descripción: Este método permitirá tanto a los clientes como hacedores iniciar sesión en la plataforma.
     * @return void
     */
    public void iniciarSesion(){
        //Proceso de interación con la base de datos
        System.out.println("Sesión iniciada ");
    }
    /**
     * Descripción: Este método permitirá tanto a los clientes como hacedores cerrar sesión en la plataforma.
     * @return void
     */
    public void cerrarSesion(){
        //Proceso de interación con la base de datos
        System.out.println("Regresa pronto");
    }
    /**
     * Descripción: Este método permitirá tanto a los clientes como hacedores
     * actualizar su número de contacto si lo requieren.
     * @param nuevoNumeroContacto Número de contacto.
     * @return void
     */
    public void actualizarNumeroContacto(String nuevoNumeroContacto){
        //Proceso de interación con la base de datos
        this.numeroContacto = nuevoNumeroContacto;
        System.out.println("Número actualizado");
    }
    /**
     * Descripción: Este método permitirá tanto a los clientes como hacedores
     * actualizar su dirección si lo requieren.
     * @param nuevaDireccion Dirección.
     * @return void
     */
    public void actualizarDireccion(String nuevaDireccion){
        //Proceso de interación con la base de datos
        this.direccion = nuevaDireccion;
        System.out.println("Dirección actualizada");
    }
    /**
     * Descripción: Este método permitirá tanto a los clientes como hacedores
     * cambiar su contrase si lo requieren.
     * @param nuevaContrasena contraseña.
     * @return void
     */
    public void cambiarContrasena(String nuevaContrasena){
        //Proceso de interación con la base de datos
        this.contrasena = nuevaContrasena;
        System.out.println("Contraseña cambiada");
    }

    @Override
    public String toString() {
        return "Bienvenido " + nombreUsuario + "\n";
    }
}
