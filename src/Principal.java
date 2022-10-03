import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ValidarRut validarRut = new ValidarRut();

        Curso curso = new Curso();

        curso.agregarAlumno("Diego", "jimenez", "123123", "3123");
        curso.agregarAlumno("Juan","antuan","21.323.123-2","12312341");
        curso.modificarApellidoAlumno("Diego","Jimenes","123123","3123");
    }
    public static void menu(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){
            System.out.println("MENU:");
            System.out.println("1. Buscar Alumno con el rut");
            System.out.println("2. Agregar alumno");
            System.out.println("3. Quitar alumno");
            System.out.println("4. Mostrar curso");
            System.out.println("5. Salir!");
            System.out.println("Escribe el Nº de una de las opciones");
            opcion = sn.nextInt();
            switch(opcion){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("Numero no valido");
            }
        }
    }

}
