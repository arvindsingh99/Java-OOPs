class FirstDuplicate {

  public static void main(String args[]) {
    int[] a = { 10, 10, 63, 48, 45, 57, 2, 3, 6, 8, 12 };
    int temp = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j=i + 1; j < a.length; j++) {
        if (a[i] == a[j]) {
          System.out.println("First Duplicate Element is :" + a[j]);
          temp = 1;
          break;
        }
      }
      if (temp == 1) {
        break;
      }
    }
    if (temp == 0) {
      System.out.println("Any Duplicate element not found");
    }
  }
}
