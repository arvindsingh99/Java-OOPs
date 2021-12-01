class Example {

    String name;
    int id;

    Example(String name, int id){
        this.name = name;
        this.id = id;  }

    public static void main(String args[]) {
        Example e1 = new Example("Arvind", 101);
        System.out.println("Default Constructor values: " + e1.name + " \n" + e1.id);
    }

}
