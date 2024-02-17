package src.main.java.formulario;

import java.util.Scanner;

public class Formulario {

    public static void registro(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("------REGISTRO DE USUARIOS-----");

        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su apellido:");
        String apellido = sc.nextLine();

        System.out.println("Seleccione el tipo de documento:");
        imprimirTipoDoc();
        int opcion = sc.nextInt();


    }

    public static void imprimirTipoDoc(){
        System.out.println("Tipo de documento");
        for (int i = 1; i  < TipoDocumento.values().length; i++){
            System.out.println(i + ". "+TipoDocumento.values()[i].getNombreDoc());
        }
    }
}
