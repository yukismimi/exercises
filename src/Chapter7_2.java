import java.sql.PseudoColumnUsage;
import java.util.HashSet;
import java.util.Iterator;

public class Chapter7_2 {
    public static void main(String[] args){
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("lugou",3));
        hashSet.add(new Person("lugou",4));
        hashSet.add(new Person("wwk",18));

        Iterator<Person> it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(!(obj instanceof Person))
            return false;
        Person person = (Person) obj;
        boolean b = this.name.equals(person.name);
        return b;
    }

    @Override
    public String toString(){
        return getName()+" "+getAge();
    }

}
