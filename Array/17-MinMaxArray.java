class MinMax {

  public static void main(String args[]) {
    int[] a = { 10, 20, 40, 21, 45, 79, 30 };
    int max = a[0];
    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    System.out.println("Max Element is " + max);
    // int min = a[0];
    // for (int i = 0; i < a.length; i++) {
    //   if (a[i] < min) {
    //     min = a[i];
    //   }
    // }
    // System.out.println("Mix Element is " + max);
  }
}
