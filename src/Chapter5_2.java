public class Chapter5_2 {
    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable() {
            int i = 0;
            @Override
            public void run() {
                while(i < 50) {
                    System.out.println("new");
                    i++;
                }
            }
        });
        t1.start();

        int i = 0;
        while(i < 100){
            System.out.println("main");
            i++;
        }
    }
}
