package pr3.org.persona;
import pr3.org.localidad.Localidad;

public class Persona{
    String nombre = "";
    int annoDeNacimiento;
    int annoActual = 2021; 
    Localidad lugarDeNacimiento; 

        public int calcularEdad(){
            int diferencia = annoActual - annoDeNacimiento; 
            return diferencia; 
            //return annoActual - annoDeNacimiento;
        }
}