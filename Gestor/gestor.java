import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDeTasques {
    private List<Tasca> tasques;
    private int idCounter = 1;

    public GestorDeTasques() {
        this.tasques = new ArrayList<>();
    }

    public void afegirTasca() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Descripció de la tasca: ");
        String descripcio = scanner.nextLine();
        System.out.print("Prioritat (baixa/mitjana/alta): ");
        Prioritat prioritat = Prioritat.valueOf(scanner.nextLine().toUpperCase());
        Tasca novaTasca = new Tasca(idCounter++, descripcio, prioritat);
        tasques.add(novaTasca);
        System.out.println("Tasca afegida amb èxit!");
    }

    public void marcarComCompletada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID de la tasca a marcar com a completada: ");
        int id = scanner.nextInt();
        Tasca tasca = trobarTascaPerId(id);
        if (tasca != null) {
            tasca.setCompletada(true);
            System.out.println("Tasca marcada com a completada!");
        } else {
            System.out.println("No s'ha trobat cap tasca amb aquest ID.");
        }
    }

    public void esborrarTasca() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID de la tasca a esborrar: ");
        int id = scanner.nextInt();
        Tasca tasca = trobarTascaPerId(id);
        if (tasca != null) {
            tasques.remove(tasca);
            System.out.println("Tasca esborrada amb èxit!");
        } else {
            System.out.println("No s'ha trobat cap tasca amb aquest ID.");
        }
    }

    public void mostrarTotes() {
        System.out.println("Totes les tasques:");
        for (Tasca tasca : tasques) {
            System.out.println(tasca);
        }
    }

    public void mostrarPerPrioritat() {
        System.out.println("Tasques per prioritat:");
        System.out.println("Baixa:");
        mostrarTasquesPer(Prioritat.BAIXA);
        System.out.println("Mitjana:");
        mostrarTasquesPer(Prioritat.MITJANA);
        System.out.println("Alta:");
        mostrarTasquesPer(Prioritat.ALTA);
    }

    private void mostrarTasquesPer(Prioritat prioritat) {
        for (Tasca tasca : tasques) {
            if (tasca.getPrioritat() == prioritat) {
                System.out.println(tasca);
            }
        }
    }

    private Tasca trobarTascaPerId(int id) {
        for (Tasca tasca : tasques) {
            if (tasca.getId() == id) {
                return tasca;
            }
        }
        return null;
    }
}