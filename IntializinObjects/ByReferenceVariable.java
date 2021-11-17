
class Animal {
    String color;
    int weight;

    public static void main(String args[]) {
        System.out.println("Object Initialization BY Referencing Variable");

        Animal dog = new Animal();
        dog.color = "black";
        dog.weight = 20;
        System.out.println("Dog Color: " + dog.color + "\nDog Weight in Kg: " + dog.weight);

    }
}
