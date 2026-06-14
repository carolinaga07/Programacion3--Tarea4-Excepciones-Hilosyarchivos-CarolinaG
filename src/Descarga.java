public class Descarga extends Thread {


    public Descarga(String nombre) {
        super(nombre);
    }

    @Override

    public void run(){
        System.out.println("Descargando" + getName() + "...");

        for(int i = 20; i <= 100; i += 20){
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " " + i + "%");
        }

        System.out.println(getName() + " Completado");
    }

    
    
}
