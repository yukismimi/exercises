public class Chapter5_3 {
    public static void main(String[] args){
        Teacher teacher = new Teacher();
        Thread t1 = new Thread(teacher,"Teacher A");
        Thread t2 = new Thread(teacher,"Teacher B");
        Thread t3 = new Thread(teacher,"Teacher C");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Teacher implements Runnable{
    int book = 80;
    Object lock = new Object();
    @Override
    public void run(){
        while(book > 0){
            synchronized (lock) {
                if(book > 0) {
                    System.out.println(Thread.currentThread().getName() + " hand out " + book);
                    book--;
                }
                if(book == 0)
                    break;
            }
        }
    }
}