public class Persona {

    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int añoNacimiento;

    
    // Constructor de la clase Persona(){}
    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int añoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
    }

void imprimir() {

    System.out.println("Nombre: " + nombre);
    System.out.println("Apellidos: " + apellidos);
    System.out.println("Número de Documento de Identidad: " + numeroDocumentoIdentidad);
    System.out.println("Año de Nacimiento: " + añoNacimiento);
    }
}
