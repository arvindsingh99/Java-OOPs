class SecondLargest {

  public static void main(String args[]) {
    int[] a = { 10,47,63,48,45,57, 2, 3, 6, 8,12};
    for (int i = 0; i < a.length; i++) {
      int flag = 0;
      for (int j = 0; j < a.length -i-1; j++) {
        //For Second minimum element we sort the array in ascending order.
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
          flag = 1;
        }
      }
      if (flag == 1) {
        break;
      }
      if (i == 1) {
        break;
      }
    }
    for (int k = 0; k < a.length; k++) {
      System.out.println(a[k]);
    }
    System.out.println("Second largest Element is " + a[1]);
  }
}
