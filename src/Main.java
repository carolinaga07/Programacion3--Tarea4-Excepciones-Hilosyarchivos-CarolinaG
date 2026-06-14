public class Main {

    public static void main(String[] args) {
        
        Descarga d1 = new Descarga("Archivo1");
        Descarga d2 = new Descarga("Archivo2");
        Descarga d3 = new Descarga("Archivo3");

        d1.start();
        d2.start();
        d3.start();
    }
    
}
