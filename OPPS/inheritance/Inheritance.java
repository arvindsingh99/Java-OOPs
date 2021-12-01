class Car {
    public void speed() {
        System.out.println("It print the speed of the car.");
    }

    public static void main(String[] args) {

    }
}

class Ferrari extends Car {
    public static void main(String[] args) {
        Ferrari f1 = new Ferrari();
        f1.speed();
    }
}