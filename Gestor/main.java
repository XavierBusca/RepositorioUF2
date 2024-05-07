import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        GestorDeTasques gestor = new GestorDeTasques();
        Scanner scanner = new Scanner(System.in);
        boolean sortir = false;

        while (!sortir) {
            mostrarMenu();
            int opcio = scanner.nextInt();
            scanner.nextLine(); // Consumir el salt de línia

            switch (opcio) {
                case 1:
                    gestor.afegirTasca();
                    break;
                case 2:
                    gestor.marcarComCompletada();
                    break;
                case 3:
                    gestor.esborrarTasca();
                    break;
                case 4:
                    gestor.mostrarTotes();
                    break;
                case 5:
                    gestor.mostrarPerPrioritat();
                    break;
                case 6:
                    sortir = true;
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna a provar.");
                    break;
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de Gestió de Tasques:");
        System.out.println("1. Afegir una nova tasca");
        System.out.println("2. Marcar una tasca com a completada");
        System.out.println("3. Esborrar una tasca");
        System.out.println("4. Mostrar totes les tasques");
        System.out.println("5. Mostrar les tasques per prioritat");
        System.out.println("6. Sortir");
        System.out.print("Selecciona una opció: ");
    }
}

