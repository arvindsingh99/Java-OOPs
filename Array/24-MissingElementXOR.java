class MissingElement {

  public static void main(String args[]) {
    int[] a = { 1, 2, 3, 4, 6 };
    int num = a[0];
    for (int i = 1; i < a.length; i++) {
      num = i ^ a[i];
    }
    System.out.println("Missing Elemnt is :" + num ^ a[0]);
  }
}
