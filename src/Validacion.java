import java.util.Scanner;

public class Validacion {


    public static String validarAfp(String texto) {
        Scanner scan = new Scanner(System.in);
        while (texto.length() < 4 || texto.length() > 30) {
            if (texto.length() < 4) {
                System.out.println("ADVERTENCIA: el texto debe tener al menos 4 caracteres");
            } else {
                System.out.println("ADVERTENCIA: el texto debe tener maximo 30 caracteres");
            }
            texto = scan.nextLine();
        }
        return texto;
    }


    public static String validarArea(String texto) {
        Scanner scan = new Scanner(System.in);
        while (texto.length() < 5 || texto.length() > 20) {
            if (texto.length() < 5) {
                System.out.println("ADVERTENCIA: el texto debe tener al menos 5 caracteres");
            } else {
                System.out.println("ADVERTENCIA: el texto debe tener maximo 20 caracteres");
            }
            texto = scan.nextLine();
        }
        return texto;
    }


    public static String datoObligatorio(String texto) {
        Scanner scan = new Scanner(System.in);
        while (texto == "") {
            System.out.println("ADVERTENCIA: dato obligatorio");
            texto = scan.nextLine();
        }
        return texto;
    }


    public static int validarRut(int texto) {
        Scanner scan = new Scanner(System.in);
        while (texto <= 0 || texto > 99999999) {
            System.out.println("ADVERTENCIA: RUT debe ser un numero entero menor a 99.999.999");
            texto = scan.nextInt();
        }
        return texto;
    }


    public static int validarEdad(int texto) {
        Scanner scan = new Scanner(System.in);
        while (texto < 0 || texto > 150) {
            System.out.println("ADVERTENCIA: la edad debe estar definida entre 0 y 150");
            texto = scan.nextInt();
        }
        return texto;
    }


    public static int validarAsistentes(int texto) {
        Scanner scan = new Scanner(System.in);
        while (!(texto >= 0) || !(texto <= 1000)) {
            System.out.println("ADVERTENCIA: la cantidad debe ser menor que 1000");
            texto = scan.nextInt();
        }
        return texto;
    }


    public static String validarDato(String texto, int min, int max) {
        Scanner scan = new Scanner(System.in);
        while (texto == "" || texto.length() < min || texto.length() > max) {
            if (texto == "") {
                System.out.println("ADVERTENCIA: dato obligatorio");
            } else if (texto.length() < min) {
                System.out.println("ADVERTENCIA: el texto debe tener al menos " + min + " caracteres");
            } else {
                System.out.println("ADVERTENCIA: el texto debe tener maximo " + max + " caracteres");
            }
            texto = scan.nextLine();
        }
        return texto;
    }


}
