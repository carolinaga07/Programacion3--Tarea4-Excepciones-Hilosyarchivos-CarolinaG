public class Corredor extends Thread   {
    boolean hayGanador = false;

    public Corredor(String name) {
        super(name);
    }

    
    @Override

    public void run(){
        System.out.println(getName() + " Estado Inicial: " + getState());

        for (int metro = 1; metro <= 10; metro++){

            try {
                int tiempo = (int)(Math.random() * 400) + 100;
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " avanzo al metro " + metro);
        }

        if (!hayGanador) {
            hayGanador = true;
            System.out.println(getName()+ " llego primero a la meta!");
            
        }else{
            System.out.println(getName() + "llego a la meta");
        }
    }
    
}
