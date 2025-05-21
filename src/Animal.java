public class Animal {

    public void sound(){
        System.out.println("All the animals make sound");
    }

    }
    class Dog extends Animal{
    public void sound(){
        System.out.println("the Dog will Bark");
    }
        }

        class Main{
    public static void main(String [] args){
        Animal A = new Dog();
        A.sound();
    }
        }
