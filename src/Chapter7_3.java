import java.util.*;

public class Chapter7_3 {
    public static void main(String[] args){
        TreeMap<Integer,String> treeMap = new TreeMap<>(new MyComparator());
        treeMap.put(1,"Lucy");
        treeMap.put(2,"John");
        treeMap.put(3,"Smith");
        treeMap.put(4,"Aimee");
        treeMap.put(5,"Amanda");
        //treeMap.forEach((number,name)->{System.out.println(number+" "+name);});

        Set<Integer> set = treeMap.keySet();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(treeMap.get(it.next()));
        }

    }
}

class MyComparator implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2){
        int id1 = (int) obj1;
        int id2 = (int) obj2;
        return id2 - id1;
    }
}
