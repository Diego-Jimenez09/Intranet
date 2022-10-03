public class Alumno {
    private String nombre,apellido,rut,numMatricula;

    /**Constructor*/
    public Alumno(String nombre, String apellido, String rut, String numMatricula){
        this.nombre=nombre;
        this.apellido=apellido;
        this.rut=rut;
        this.numMatricula=numMatricula;
    }
    /**get retorna set cambia*/
    public void setRut(String rut){
        this.rut=rut;
    }
    public String getRut(){
        return rut;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

}