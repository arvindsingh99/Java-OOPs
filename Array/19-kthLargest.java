class KthLargest {

  public static void main(String args[]) {
    int[] a = { 10, 47, 63, 48, 45, 57, 3, 68, 89 };
    int k=4;
    for (int i = 0; i < a.length; i++) {
        int flag=0;
      for (int j = 0; j < a.length-i-1; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
          flag = 1;
        }
      }
      if (flag == 0) {
        break;
      }
      if(i==k-1){
          break;
      }
    }
    for (int m = 0; m < a.length; m++) {
      System.out.println(a[m]);
    }
    System.out.println("Kth Largest Element is " + a[a.length-k]);
  }
}
