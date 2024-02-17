package src.main.java.formulario;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.regex.Pattern;

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

        sc.nextLine();

        boolean numDocumentoValido = false;
        do {
            System.out.println("Digite el número de documento:");
            String numDocumento = sc.nextLine();
            if(!validarCampo(numDocumento, "\\d{1,10}")){
                System.out.println("El número de documento ingresado es inválido. \nDebe contener solo dígitos y tener máximo 10 caracteres.");
            }else {
                numDocumentoValido = true;
            }
        } while (!numDocumentoValido);


        System.out.println("Ingrese su fecha de nacimiento en formato dd/MM/yyyy:");
        Date fechaNacimiento = solicitarFecha(sc);

        System.out.println("Digite su genero");
        String genero = sc.nextLine();

        System.out.println("Ingrese su dirección de domicilio:");
        String direccion = sc.nextLine();

        System.out.println("Ingrese su correo electronico:");
        String email = sc.nextLine();

        boolean telefonoValido = false;
        do {
            System.out.println("numero de Telefono:");
            String telefono = sc.nextLine();
            if (!validarCampo(telefono, "\\d{1,10}")){
                System.out.println("El número de teléfono ingresado es inválido. \nDebe contener solo dígitos y tener máximo 10 caracteres.");
            }else {
                telefonoValido = true;
            }
        }while (!telefonoValido);

    }

    public static void imprimirTipoDoc(){
        System.out.println("Tipo de documento");
        for (int i = 1; i  < TipoDocumento.values().length; i++){
            System.out.println(i + ". "+TipoDocumento.values()[i].getNombreDoc());
        }
    }

    public static Date solicitarFecha(Scanner sc){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
        Date fecha = null;

        boolean fechaValida = false;
        while (!fechaValida){
            String fechaString = sc.nextLine();
            try {
                fecha = dateFormat.parse(fechaString);
                fechaValida = true;
            } catch (ParseException e){
                System.out.println("Error: Formato de fecha invalido!. Ingrese nuevamente");
            }
        }
        return fecha;
    }

//    public static boolean validarNumDocumento(String numDocumento){
//        return Pattern.matches("\\d{1,10}", numDocumento);
//    }

    public static boolean validarCampo(String campo, String patron) {
        return Pattern.matches(patron, campo);
    }
}
