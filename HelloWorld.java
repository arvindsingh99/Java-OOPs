class Animal {

    public void eat() {
        System.out.println("I can Eat\n");
    }

    public void run() {
        System.out.println("I can Run\n");
    }

    public static void main(String args[]) {
        System.out.println("Object and Methods\n");
        Animal dog = new Animal();
        dog.eat();
        dog.run();
        // We connot access other class method,Objects and methods must be belongs to same class for accesing
        // So creating new object of class Bird
        Bird crow = new Bird();
        crow.fly();
    }
}

class Bird {
    public void fly() {
        System.out.println("Crow : I can Fly");
    }
}