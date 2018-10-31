import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Chapter7_1{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i ++){
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
