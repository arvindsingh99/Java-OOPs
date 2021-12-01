

class Fish {

    String color;
    int weight;

    void initObject(String c, int w) {
        color = c;
        weight = w;
    }

    void display() {
        System.out.println("Rohu Color: " + color + "\nRohu Weight: " + weight);
    }

    public static void main(String args[]) {
        System.out.println("Object Intialization By Methods");
        Fish rohu = new Fish();
        rohu.initObject("black", 1000);
        rohu.display();
    }

}
