import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{

        System.out.println("=========================");
        System.out.println("     MENU PRINCIPAL      ");
        System.out.println("=========================");
        System.out.println(" 1. Simulador de descarga");
        System.out.println(" 2. Carrera de corredores");
        System.out.println(" 3. Validador de edad");
        System.out.println(" 4. Calculadora");
        System.out.println(" 5. Registro de Actividades");
        System.out.println(" 6. Salir");
        System.out.println("=========================");
        System.out.println(" Elija una opcion: ");

        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
               Descarga d1 = new Descarga("Archivo1");
               Descarga d2 = new Descarga("Archivo2");
               Descarga d3 = new Descarga("Archivo3");

                d1.start();
                d2.start();
                d3.start();

                try {
                    d1.join();
                    d2.join();
                    d3.join();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 2:

                Corredor.hayGanador = false;


                Corredor corredor1 = new Corredor("Jose");
                Corredor corredor2 = new Corredor("Maria");
                Corredor corredor3 = new Corredor("Juan");

                corredor1.start();
                corredor2.start();
                corredor3.start();

                try {
                    corredor1.join();
                    corredor2.join();
                    corredor3.join();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                break;
            
            case 3:

                ValidadorEdad ve = new ValidadorEdad();
                ve.Iniciar();
                break;

            case 4:

                CalculadoraSegura cs = new CalculadoraSegura();
                cs.Iniciar();
                break;

            case 5:

                RegistroActividades ra = new RegistroActividades();
                ra.iniciar();
                break;

            case 6:
                System.out.println("Saliendo...");
                break;
        
            default:
                System.out.println("Opcion invalida");
                break;
        }


        }while(opcion != 6);


    }

   
    
}
