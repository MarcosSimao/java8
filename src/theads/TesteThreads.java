package theads;

public class TesteThreads {

    public static void main(String [] args){
        new Thread(t1).start();
        new Thread(t2).start();
    }
    private static Runnable t1 = new Runnable() {
        @Override
        public void run() {
          for(int i=0;i<=10;i++){
              System.out.println("thread 1: "+i);
          }
        }
    };
    private static Runnable t2 = new Runnable() {
        @Override
        public void run() {
            for(int j=0;j<=10;j++){
                System.out.println("thread 2: "+j);
            }
        }
    };
}
