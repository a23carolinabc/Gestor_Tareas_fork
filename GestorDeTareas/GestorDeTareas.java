import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeTareas {
    private static ArrayList<Tarea> tareas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Agregar Tarea");
            System.out.println("2. Listar Tareas");
            System.out.println("3. Eliminar Tarea");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Escribe el nombre de la nueva tarea: ");
                    String nombreTarea = scanner.nextLine();
                    agregarTarea(nombreTarea);
                    break;

                case 2:
                    listarTareas();
                    break;

                case 3:
                    System.out.print("Escribe el nombre de la tarea a eliminar: ");
                    String tareaEliminar = scanner.nextLine();
                    eliminarTarea(tareaEliminar);
                    break;

                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    private static void agregarTarea(String nombreTarea) {
        Tarea nuevaTarea = new Tarea(nombreTarea);
        tareas.add(nuevaTarea);
    }

    private static void listarTareas() {
        System.out.println("Lista de Tareas:");
        for (Tarea tarea : tareas) {
            System.out.println("- " + tarea.getNombre());
        }
    }

    private static void eliminarTarea(String nombreTarea) {
        Tarea tareaAEliminar = null;
    // Buscar la tarea por nombre
    for (Tarea tarea : tareas) {
        if (tarea.getNombre().equals(nombreTarea)) {
            tareaAEliminar = tarea;
            break;
        }
    }
    // Eliminar la tarea si se encontró
    if (tareaAEliminar != null) {
        tareas.remove(tareaAEliminar);
        System.out.println("Tarea eliminada: " + nombreTarea);
    } else {
        System.out.println("No se encontró la tarea: " + nombreTarea);
    }
    
}
