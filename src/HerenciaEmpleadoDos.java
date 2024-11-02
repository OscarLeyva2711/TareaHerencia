import java.util.Scanner;

public class HerenciaEmpleadoDos {
    public static void main(String[] args) {
        int op = 0;
        int op1 = 0;
        Scanner sc = new Scanner(System.in);
        CentroEmpleados ce = new CentroEmpleados();

        do {
            System.out.println("1. Registrar empleado");
            System.out.println("2. Mostrar todos los empleados");
            System.out.println("3. Mostrar empleado por Nombre");
            System.out.println("4. Mostrar empleado por Salario");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");
            op = sc.nextInt();
            sc.nextLine(); // limpiar el buffer después de leer un int

            switch(op) {
                case 1:
                    System.out.println("¿Qué tipo de empleado es?");
                    System.out.println("1. Jefe");
                    System.out.println("2. Empleado");
                    System.out.println("3. Auxiliar");
                    System.out.println("4. Salir");
                    System.out.print("Selecciona una opcion: ");
                    op1 = sc.nextInt();
                    sc.nextLine(); // limpiar el buffer después de leer un int

                    switch(op1) {
                        case 1: // Jefe
                            System.out.print("Ingrese el nombre del jefe: ");
                            String nombreJefe = sc.nextLine();
                            System.out.print("Ingrese el salario del jefe: ");
                            double sueldoJefe = sc.nextDouble();
                            System.out.print("Ingrese el bono del jefe: ");
                            float bonoJefe = sc.nextFloat();
                            sc.nextLine(); // limpiar el buffer
                            Jefe nuevoJefe = new Jefe(nombreJefe, sueldoJefe, bonoJefe);
                            System.out.print("Ingrese la antigüedad del jefe (años): ");
                            nuevoJefe.antiguedad = sc.nextInt();
                            sc.nextLine(); // limpiar el buffer
                            ce.agregarEmpleado(nuevoJefe);
                            break;

                        case 2: // Empleado
                            System.out.print("Ingrese el nombre del empleado: ");
                            String nombreEmpleado = sc.nextLine();
                            System.out.print("Ingrese el salario del empleado: ");
                            double sueldoEmpleado = sc.nextDouble();
                            sc.nextLine(); // limpiar el buffer
                            Empleado nuevoEmpleado = new Empleado(nombreEmpleado, sueldoEmpleado);
                            System.out.print("Ingrese la antigüedad del empleado (años): ");
                            nuevoEmpleado.antiguedad = sc.nextInt();
                            sc.nextLine(); // limpiar el buffer
                            ce.agregarEmpleado(nuevoEmpleado);
                            break;

                        case 3: // Auxiliar
                            System.out.print("Ingrese el nombre del auxiliar: ");
                            String nombreAuxiliar = sc.nextLine();
                            System.out.print("Ingrese el salario del auxiliar: ");
                            double sueldoAuxiliar = sc.nextDouble();
                            sc.nextLine(); // limpiar el buffer
                            System.out.print("Ingrese el área del auxiliar: ");
                            String areaAuxiliar = sc.nextLine();
                            System.out.print("Ingrese el número de asistencias del auxiliar: ");
                            int asistenciasAuxiliar = sc.nextInt();
                            sc.nextLine(); // limpiar el buffer
                            Auxiliar nuevoAuxiliar = new Auxiliar(nombreAuxiliar, sueldoAuxiliar, areaAuxiliar, asistenciasAuxiliar);
                            System.out.print("Ingrese la antigüedad del auxiliar (años): ");
                            nuevoAuxiliar.antiguedad = sc.nextInt();
                            sc.nextLine(); // limpiar el buffer
                            ce.agregarEmpleado(nuevoAuxiliar);
                            break;
                    }
                    break;
                case 2:System.out.println(ce.mostrarTodosLosEmpleados());
                break;
                case 3:System.out.println(ce.mostrarEmpleadosPorNombre());
                break;
                case 4:System.out.println(ce.mostrarEmpleadosPorSalario());


            }
        }while (op!=5);
    }
}

