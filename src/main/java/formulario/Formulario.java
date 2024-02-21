package src.main.java.formulario;

import src.main.java.formulario.enums.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Formulario {
    public static void registro() {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------REGISTRO DE USUARIOS---------------");

        String nombre = validarCampo(sc, "nombre");

        String apellido = validarCampo(sc, "apellido");

        TipoDocumento tipoDocumento = imprimirTipoDoc(sc);

        boolean numDocumentoValido = false;
        String numDocumento;
        do {
            System.out.println("Digite el número de documento:");
            numDocumento = sc.nextLine();
            if (!validarCampo(numDocumento, "\\d{1,10}")) {
                System.out.println("El número de documento ingresado es inválido. \nDebe contener solo dígitos y tener máximo 10 caracteres.");
            } else {
                numDocumentoValido = true;
            }
        } while (!numDocumentoValido);

        System.out.println("\nIngrese su fecha de nacimiento en formato dd/MM/yyyy:");
        Date fechaNacimiento = solicitarFecha(sc);

        String direccion = validarCampo(sc, "direccion");

        String email = validarEmail(sc);

        Genero genero = imprimirGeneros(sc);

        boolean telefonoValido = false;
        String telefono;
        do {
            System.out.println("numero de Telefono:");
            telefono = sc.nextLine();
            if (!validarCampo(telefono, "\\d{1,10}")) {
                System.out.println("El número de teléfono ingresado es inválido. \nDebe contener solo dígitos y tener máximo 10 caracteres.");
            } else {
                telefonoValido = true;
            }
        } while (!telefonoValido);

        String pais = "Colombia";
        System.out.println("\nPais: \n" + pais);

        String dpto = validarCampo(sc, "departamento");

        String ciudad = validarCampo(sc, "ciudad");

        NivelAcademico nivelAcademico = imprimirNivelAcademico(sc);

        TipoSangre tipoSangre = imprimirTipoSangre(sc);

        String eps = validarCampo(sc, "Eps");

        String caja = validarCampo(sc, "caja de compensación");

        Pension pension = imprimirFondoPension(sc);

        Cesantias cesantias = imprimirCesantia(sc);

        System.out.println("¡SUS DATOS HAN SIDO REGISTRADOS SATISFACTORIAMENTE!.\n");

        mostrarDatosRegistrados(nombre, apellido, tipoDocumento.getNombreDoc(), numDocumento, fechaNacimiento, direccion, email, genero.getGenero(),
                telefono, pais, dpto, ciudad, nivelAcademico.getNivelAcademico(), tipoSangre.getTipoSangre(), eps, caja, pension.getPension(), cesantias.getCesantias());
    }

    public static TipoDocumento imprimirTipoDoc(Scanner sc) {
        System.out.println("\nSeleccione el tipo de documento:");
        TipoDocumento[] tipoDocumentos = TipoDocumento.values();
        for (int i = 0; i < TipoDocumento.values().length; i++) {
            System.out.println((i + 1) + ". " + TipoDocumento.values()[i].getNombreDoc());
        }
        int opcion = 0;
        do {
            String input = sc.nextLine();
            if (!input.matches("\\d+")) {
                System.out.println("Por favor, ingrese una opción valida.");
                continue;
            }
            opcion = Integer.parseInt(input);
            System.out.println((opcion < 1 || opcion > tipoDocumentos.length) ? "Por favor, ingrese una opción válida." : "");
        } while (opcion < 1 || opcion > tipoDocumentos.length);
        return tipoDocumentos[opcion - 1];
    }
    public static Genero imprimirGeneros(Scanner sc) {
        System.out.println("\nSeleccione el tipo de genero: ");
        Genero[] genero = Genero.values();
        for (int i = 0; i < Genero.values().length; i++) {
            System.out.println((i + 1) + ". " + Genero.values()[i].getGenero());
        }
        int opcion = 0;
        do {
            String input = sc.nextLine();
            if (!input.matches("\\d+")) {
                System.out.println("Por favor, ingrese una opción valida.");
                continue;
            }
            opcion = Integer.parseInt(input);
            System.out.println((opcion < 1 || opcion > genero.length) ? "Por favor, ingrese una opción valida." : "");
        } while (opcion < 1 || opcion > genero.length);
        return genero[opcion -1];
    }
    public static NivelAcademico imprimirNivelAcademico(Scanner sc) {
        System.out.println("\nSeleccione el nivel academico:");
        NivelAcademico[] nivelAcademico = NivelAcademico.values();
        for (int i = 0; i < NivelAcademico.values().length; i++) {
            System.out.println((i + 1) + ". " + NivelAcademico.values()[i].getNivelAcademico());
        }
        int opcion = 0;
        do {
            String input = sc.nextLine();
            if (!input.matches("\\d+")) {
                System.out.println("Por favor, ingrese una opción valida.");
                continue;
            }
            opcion = Integer.parseInt(input);
            System.out.println((opcion < 1 || opcion > nivelAcademico.length) ? "Por favor, ingrese una opción valida." : "");
        } while (opcion < 1 || opcion > nivelAcademico.length);
        return nivelAcademico[opcion -1];
    }
    public static TipoSangre imprimirTipoSangre(Scanner sc) {
        System.out.println("Seleccione su tipo de sangre:");
        TipoSangre[] tipoSangre = TipoSangre.values();
        for (int i = 0; i < TipoSangre.values().length; i++) {
            System.out.println((i + 1) + ". " + TipoSangre.values()[i].getTipoSangre());
        }
        int opcion = 0;
        do {
            String input = sc.nextLine();
            if (!input.matches("\\d+")) {
                System.out.println("Por favor, ingrese una opción valida.");
                continue;
            }
            opcion = Integer.parseInt(input);
            System.out.println((opcion < 1 || opcion > tipoSangre.length) ? "Por favor, ingrese una opción valida." : "");
        } while (opcion < 1 || opcion > tipoSangre.length);
        return tipoSangre[opcion -1];
    }
    public static Pension imprimirFondoPension(Scanner sc) {
        System.out.println("\nSeleccione su fondo de pension");
        Pension[] pension = Pension.values();
        for (int i = 0; i < Pension.values().length; i++) {
            System.out.println((i + 1) + ". " + Pension.values()[i].getPension());
        }
        int opcion = 0;
        do {
            String input = sc.nextLine();
            if (!input.matches("\\d+")) {
                System.out.println("Por favor, ingrese una opción valida.");
                continue;
            }
            opcion = Integer.parseInt(input);
            System.out.println((opcion < 1 || opcion > pension.length) ? "Por favor, ingrese una opción valida." : "");
        } while (opcion < 1 || opcion > pension.length);
        return pension[opcion -1];
    }
    public static Cesantias imprimirCesantia(Scanner sc) {
        System.out.println("Seleccione su fondo de cesantias:");
        Cesantias[] cesantias = Cesantias.values();
        for (int i = 0; i < Cesantias.values().length; i++) {
            System.out.println((i + 1) + ". " + Cesantias.values()[i].getCesantias());
        }
        int opcion = 0;
        do {
            String input = sc.nextLine();
            if (!input.matches("\\d+")) {
                System.out.println("Por favor, ingrese una opción valida.");
                continue;
            }
            opcion = Integer.parseInt(input);
            System.out.println((opcion < 1 || opcion > cesantias.length) ? "Por favor, ingrese una opción valida." : "");
        } while (opcion < 1 || opcion > cesantias.length);
        return cesantias[opcion -1];
    }
    public static Date solicitarFecha(Scanner sc) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
        Date fecha = null;
        boolean fechaValida = false;
        while (!fechaValida) {
            String fechaString = sc.nextLine();
            try {
                fecha = dateFormat.parse(fechaString);
                fechaValida = true;
            } catch (ParseException e) {
                System.out.println("Error: Formato de fecha invalido!. Ingrese la fecha nuevamente");
            }
        }
        return fecha;
    }
    public static boolean validarCampo(String campo, String patron) {
        return Pattern.matches(patron, campo);
    }
    public static String validarCampo(Scanner sc, String campo) {
        String valor;
        do {
            System.out.println("\nIngrese su " + campo + ":");
            valor = sc.nextLine();
            if (valor.isEmpty()) {
                System.out.println("El campo " + campo + " no puede estar vacío.");
            }
        } while (valor.isEmpty());
        return valor;
    }
    public static String validarEmail(Scanner sc) {
        String email;
        do {
            System.out.println("\nIngrese su correo electrónico:");
            email = sc.nextLine();
            if (email.isEmpty()) {
                System.out.println("El campo correo electrónico no puede estar vacío.");
            } else if (!email.contains("@")) {
                System.out.println("Ingrese un correo correcto valido. \n Ejemplo: example@example.com");
            }
        } while (email.isEmpty() || !email.contains("@"));
        return email;
    }
    public static void mostrarDatosRegistrados(String nombre, String apellido, String tipoDocumento, String numDocumento,
                                               Date fechaNacimiento, String direccion, String email, String genero,
                                               String telefono, String pais, String dpto, String ciudad, String nivelAcademico,
                                               String tipoSangre, String eps, String caja, String pension, String cesantias) {
        System.out.println("\n----------------DATOS REGISTRADOS----------------");
        System.out.printf("Nombre: %s\n", nombre);
        System.out.printf("Apellido: %s\n", apellido);
        System.out.printf("Tipo de documento: %s\n", tipoDocumento);
        System.out.printf("Número de documento: %s\n", numDocumento);
        System.out.printf("Fecha de nacimiento: %tF\n", fechaNacimiento);
        System.out.printf("Dirección: %s\n", direccion);
        System.out.printf("Correo electrónico: %s\n", email);
        System.out.printf("Género: %s\n", genero);
        System.out.printf("Teléfono: %s\n", telefono);
        System.out.printf("País: %s\n", pais);
        System.out.printf("Departamento: %s\n", dpto);
        System.out.printf("Ciudad: %s\n", ciudad);
        System.out.printf("Nivel académico: %s\n", nivelAcademico);
        System.out.printf("Tipo de sangre: %s\n", tipoSangre);
        System.out.printf("EPS: %s\n", eps);
        System.out.printf("Caja de compensación: %s\n", caja);
        System.out.printf("Fondo de pensión: %s\n", pension);
        System.out.printf("Cesantías: %s\n", cesantias);
    }




}
