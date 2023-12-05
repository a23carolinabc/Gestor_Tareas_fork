
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Tarea {
    private String name;
    private LocalDate fechaLimite;

    public Tarea (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFechaLimite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha límite de la tarea (en formato dd-MM-yyyy): ");
        String fecha = scanner.nextLine();
        fechaLimite = LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public String getFechaLimite() {
        fechaLimite = LocalDate.of(2023, 12, 5);
        DateTimeFormatter cambiada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaCambiada = fechaLimite.format(cambiada);
        return fechaCambiada;
    }


   
}