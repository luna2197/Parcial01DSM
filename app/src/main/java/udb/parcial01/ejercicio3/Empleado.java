package udb.parcial01.ejercicio3;

public class Empleado {
  private String nombre;
  private  String apellido;
  private  String cargo;
  private int horas;

    public  Empleado(){

    }

    public  Empleado(String nombre, String apellido, String cargo, int horas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.horas = horas;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public double getHoras() {
        return horas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}


