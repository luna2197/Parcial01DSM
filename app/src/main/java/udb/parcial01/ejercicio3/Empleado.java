package udb.parcial01.ejercicio3;

public class Empleado {
  private String nombre;
  private  String apellido;
  private  String cargo;
  private int horas;
  private  double sueldol;
  private double isss;
    private double afp;
    private double renta;

    public  Empleado(){

    }

    public  Empleado(String nombre, String apellido, String cargo, int horas, double sueldol, double isss, double afp , double renta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.horas = horas;
        this.sueldol = sueldol;
        this.isss = isss;
        this.afp = afp;
        this.renta = renta;

    }

    public double getSueldol() {
        return sueldol;
    }

    public double getIsss() {
        return isss;
    }

    public double getAfp() {
        return afp;
    }

    public double getRenta() {
        return renta;
    }

    public void setSueldol(double sueldol) {
        this.sueldol = sueldol;
    }

    public void setIsss(double isss) {
        this.isss = isss;
    }

    public void setAfp(double afp) {
        this.afp = afp;
    }

    public void setRenta(double renta) {
        this.renta = renta;
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
    @Override
    public String toString() {
        return nombre + "  ISSS: $"+ isss+ "  AFP: $"+afp+"  Renta: $" +renta+"  Sueldo Liquido: $"+sueldol;
    }
}


