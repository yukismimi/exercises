public class Chapter5_1 {
    public static void main(String[] args){
        Thread t1 = new MyThread("Thread-1");
        Thread t2 = new MyThread("Thread-2");
        t1.start();
        t2.start();
    }

}

class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        while(true)
            System.out.println(Thread.currentThread().getName());
    }
}
