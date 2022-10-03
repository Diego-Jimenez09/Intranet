import java.util.ArrayList;

public class Curso {

    ArrayList<Alumno> curso = new ArrayList<>();
    public Alumno asignaralumno(String nombre, String apellido, String rut, String numMatricula){
        Alumno alumnoNuevo= new Alumno(nombre,apellido,rut,numMatricula);
        return alumnoNuevo;
    }
    public Alumno agregarAlumno(String nombre, String apellido, String rut, String numMatricula){
        Alumno alumnoNuevo= new Alumno(nombre,apellido,rut,numMatricula);
        this.curso.add(alumnoNuevo);
        return alumnoNuevo;
    }
    public void modificarRutAlumno(String nombre, String apellido,String matricula, String rut){
        for(Alumno estudiante: this.curso){
            if(estudiante.getNombre().equals(nombre) && estudiante.getApellido().equals(apellido) && estudiante.getNumMatricula().equals(matricula)){
                estudiante.setRut(rut);
                break;
            }
        }
    }
    public void modificarMatriculaAlumno(String nombre, String apellido, String rut,String matricula){
        for(Alumno estudiante: this.curso){
            if(estudiante.getNombre().equals(nombre) && estudiante.getApellido().equals(apellido) && estudiante.getRut().equals(rut)){
                estudiante.setNumMatricula(matricula);
                break;
            }
        }
    }
    public void modificarNombreAlumno(String nombre, String apellido, String rut,String matricula){
        for(Alumno estudiante: this.curso){
            if(estudiante.getApellido().equals(apellido) && estudiante.getRut().equals(rut) && estudiante.getNumMatricula().equals(matricula)){
                estudiante.setNombre(nombre);
                break;
            }
        }
    }
    public void modificarApellidoAlumno(String nombre, String apellido, String rut,String matricula){
        for(Alumno estudiante: this.curso){
            if(estudiante.getNombre().equals(nombre) && estudiante.getRut().equals(rut) && estudiante.getNumMatricula().equals(matricula)){
                estudiante.setApellido(apellido);
                break;
            }
        }
    }
    public boolean eliminarAlumno(String nombre, String apellido, String rut, String numMatricula){
        for(Alumno estudiante: this.curso){
            if (estudiante.getNombre().equals(nombre) && estudiante.getApellido()==apellido){
                this.curso.remove(estudiante);
                return true;
            }
        }
        return false;
    }
    public void imprimirCurso(ArrayList<Alumno> curso){
        System.out.println(curso.size());
    }
}
