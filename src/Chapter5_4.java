public class Chapter5_4 {
    public static void main(String[] args) throws Exception{
        for(int i = 0; i < 10; i++){
            new Thread(new AddThread(i*10+1)).start();
        }
        Thread.sleep(1000);
        System.out.println("Sum:"+AddThread.Sum);
    }
}

class AddThread implements Runnable{

    private int startNum,endNum,sum = 0;
    static int Sum = 0;

    AddThread(int startNum){
        this.startNum = startNum;
        this.endNum = startNum+10;
    }

    @Override
    public void run(){
        while(startNum < endNum){
            sum += startNum;
            startNum++;
        }
        System.out.println(Thread.currentThread().getName()+" sum:"+sum);
        Sum += sum;
    }
}
