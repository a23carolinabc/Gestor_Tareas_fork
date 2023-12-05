public class AplicacionGestionTareas {
    public static void main(String[] args) {

        Tarea tarea1 = new Tarea("Tarea 1");
        

        tarea1.setFechaLimite();
        System.out.println(tarea1.getFechaLimite());
    }
}