public class Singleton {
    public static void main(String[] args){
        System.out.println(Moon.getInstance());
    }
}

class Moon{

    private static Moon moon = new Moon();

    private Moon(){
        this.moon = moon;
    }

    public static Moon getInstance(){
        return moon;
    }

    public String toString(){
        return "I am moon";
    }
}