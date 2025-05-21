public class Encapsulation {
    private int age;
    private int b;
    public Encapsulation(int a,int b){
        this.age =a;
        this.b = b;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
class Main1{
public static void main(String [] args) {
    Encapsulation E = new Encapsulation(10,40);
    System.out.println(E.getAge());
    E.setAge(40);
    System.out.println("my current Age is "+E.getAge());
}
}

