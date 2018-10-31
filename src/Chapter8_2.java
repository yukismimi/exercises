import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter8_2 {
    public static void main(String[] args) throws Exception{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str;
        int i;
        for(i=0;i<5;i++){
            System.out.print("请输入密码:");
            str = bufferedReader.readLine();
            if(str.equals("123456")) {
                System.out.println("恭喜进入游戏");
                break;
            }
        }
        if(i == 5){
            System.out.println("密码错误，结束游戏");
            System.exit(0);
        }
    }
}
