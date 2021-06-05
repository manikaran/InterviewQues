
public class Dog implements Animal {
    class Node {
        int value = 3;
        int address = 98;
    }

    String name ;
    int age;

    public Dog(){
        this.name = "Gori";
        this.age = 10;
    }

    public void getName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog dog = new dog(); 
        Node node = dog.new Node();
        System.out.println(dog.address);
    }
}