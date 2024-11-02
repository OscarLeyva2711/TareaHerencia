import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CentroEmpleados {
    private ArrayList<Empleado> misEmpleados;

    public CentroEmpleados() {
        misEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        misEmpleados.add(empleado);
    }

    public String mostrarTodosLosEmpleados() {
        StringBuilder cadena = new StringBuilder();
        misEmpleados.forEach(e -> cadena.append(e.toString() + "\n"));
        return cadena.toString();
    }

    public String mostrarDiasDeVacaciones() {
        StringBuilder cadena = new StringBuilder();
        misEmpleados.forEach(e -> cadena.append(e.getNombre() + "Tiene" + e.calcularDiasDeVacaciones() + "de Vacaciones" + e.calcularDiasDeVacaciones() + "\n"));
        return cadena.toString();
    }

    public String mostrarEmpleadosPorNombre() {
        misEmpleados.sort(Comparator.comparing(Empleado::getNombre));
        StringBuilder cadena = new StringBuilder();

        misEmpleados.forEach(e -> cadena.append(e.toString() + "\n"));

        return cadena.toString();
    }
public String mostrarEmpleadosPorSalario() {
    misEmpleados.sort(Comparator.comparing(Empleado::getSueldo));
        StringBuilder cadena = new StringBuilder();
        misEmpleados.forEach(e -> cadena.append(e.toString() + "\n"));
        return cadena.toString();
}

}
