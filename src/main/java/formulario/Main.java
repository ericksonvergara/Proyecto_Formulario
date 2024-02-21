package src.main.java.formulario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Inicio.ejecutarFormulario(sc);
        System.out.println("Saliendo del programa...");
        sc.close();

    }
}