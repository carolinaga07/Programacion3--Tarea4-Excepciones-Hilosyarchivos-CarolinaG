import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Descarga d1 = new Descarga("Archivo1");
        Descarga d2 = new Descarga("Archivo2");
        Descarga d3 = new Descarga("Archivo3");

        

        d1.start();
        d2.start();
        d3.start();

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        try {
            ValidarEdad(edad);

        } catch (EdadInvalidaException e) {
            
            System.out.println("Error: " + e.getMessage());
        }




    }

   
    
}
