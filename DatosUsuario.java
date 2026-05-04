/**
 *
 * Esta clase pretende mostrar los datos del usuario
 * @author Enrique
 *
 */

public class DatosUsuario {

    /**
     * Muestra los datos del usuario
     * @param nombre nombre del usuario
     * @param edad edad del usuario
     * @param anios anios a sumar para saber cuantos años tendrá el usuario una vez pasados estos años
     *
     */
    public static void mostrarDatos(String nombre, int edad, int anios){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Dentro de: " + anios + " años, " + nombre + " tendrá "+ sumarAnios(edad, anios) + " años.");
    }

    /**
     *
     * Refactorización de la suma de aniosTotal en un método
     * @param edad Usamos la edad de mostrarDatos
     * @param anios Usamos los anios de mostrarDatos
     * @return Devolvemos la suma de edad más anios. Con esto obtenemos la edad del usuario pasados x anios.
     *
     */
    public static int sumarAnios(int edad, int anios){
        return (edad + anios);
    }


}
