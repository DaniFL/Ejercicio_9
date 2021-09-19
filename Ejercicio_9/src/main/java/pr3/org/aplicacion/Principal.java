package pr3.org.aplicacion;

//import pr3.org.persona.*;
//import pr3.org.localidad.*;
import pr3.org.localidad.Localidad;
import pr3.org.persona.Persona;

public class Principal {
    public static void main(String[] args) {

        Persona javier = new Persona();
        javier.nombre = "Javier";
        // System.out.println(javier.nombre);
        javier.annoDeNacimiento = 1990;
        // System.out.println(javier.annoDeNacimiento);
        // System.out.println(javier.calcularEdad());

        Localidad madrid = new Localidad();
        madrid.nombre = "Madrid";
        madrid.numeroDeHabitantes = 20000;
        javier.lugarDeNacimiento = madrid;

        System.out.println(javier.nombre + " tiene " + javier.calcularEdad() + " años y vive en  " + madrid.nombre
                + " que tiene " + madrid.numeroDeHabitantes + " habitantes");
    }
}