 class SingleNonRepeatedElement {

  public static void main(String args[]) {
    int[] a = { 1, 2, 3, 4, 5, 1, 3, 4, 5 };
    int res = a[0];
    for (int i = 1; i < a.length; i++) {
      res = res^a[i];
    }
    System.out.println("Single Non Repeatd Element is: " + res);
  }
}
