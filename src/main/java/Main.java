import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Crear cliente
        Cliente cliente1 = new Cliente("Juan", "JuanGomez", "Gomez",
                "jjgomeza22@gmail.com", "3165326067", "Mercedes del norte",
                "Juan201*");
        System.out.println(cliente1);

        //Solicitar un servicio
        cliente1.solicitarServicio("Pasear mi mascota", "Solicito una persona cuidadosa" +
                " y amorosa con las animales, para pasear mi perro el dia martes", "Barrio mercedes",
                new Date());
        //Proponer un servicio
        cliente1.proponerServicio("Lavado de auto", "Lavado de autos a vapor y a presion");

        cliente1.mostrarServicios();
        cliente1.mostrarNuevosServicios();

        //Crear Hacedor
        Hacedor hacedor1 = new Hacedor("Jose", "JoseAguirre", "Aguirre",
                "joseAguirre@gmail.com", "3172614962", "Mercedes", "Jose123*");
        System.out.println(hacedor1);
        //Agregar una habilidad
        hacedor1.agregarHabilidad("Pasear Perros", "Soy una persona que ama los animales y" +
                "y me gusta que siempre se sientan comodos y felices");
    }
}
