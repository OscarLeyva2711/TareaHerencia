public class Empleado {
    protected String nombre;
    protected double sueldo;
    protected long id;
    static long idactual = 0;
    protected int antiguedad;

    public java.lang.String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public double getSueldo(){
        return sueldo;
}
    public Empleado(String nombre, double sueldo) {
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.id= idactual++; ;
    }
    public int calcularDiasDeVacaciones(){
        int numeroDias=0;
        if(antiguedad<2){
            numeroDias=12;
        } else if (antiguedad<10) {
            numeroDias=14;

        } else if (antiguedad<15) {
            numeroDias=18;

        }else numeroDias=25;
        return numeroDias;
    }
    public String toString(){
        return "Nombre: "+nombre+" Sueldo: "+sueldo+" Id: "+id +" Dias de vacaciones: "+calcularDiasDeVacaciones();
    }
}

