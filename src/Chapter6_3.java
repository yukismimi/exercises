import java.util.Random;

public class Chapter6_3 {
    public static void main(String[] args){
        Random random = new Random();
        for(int i=0;i<5;i++){
            System.out.println(20+random.nextInt(31));
        }
    }
}
