public class Jefe  extends Empleado{
    private float bono;
    public Jefe(String nombre,double sueldo,float bono){
        super(nombre,sueldo);
        this.bono = bono;
    }

    @Override
    public int calcularDiasDeVacaciones() {
        return 31;
    }
    public String toString(){
        return super.toString()+" Bono del Jefe: "+bono;
    }
}
