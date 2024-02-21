package src.main.java.formulario;
import java.util.Scanner;
public class Inicio {
    public static void ejecutarFormulario(Scanner sc) {
        boolean continuar = true;

        do {
            Formulario.registro();

            System.out.println("\n¿Qué desea hacer a continuación?");
            System.out.println("1. Registrar otro usuario.");
            System.out.println("2. Salir");
            System.out.print("Ingrese el número de la opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    continuar = true;
                    break;
                case 2:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número válido.");
            }
        } while (continuar);
    }
}
