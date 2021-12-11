class SecondMinimum {

  public static void main(String args[]) {
    int[] a = { 10,47,63,48,45,57,3,68,89};
    for (int i = 0; i < a.length; i++) {
      int flag = 0;
      for (int j = 0; j < a.length-i-1; j++) {
        if (a[j] < a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
          flag = 1;
        }
      }
      if (flag == 0) {
        break;
      }
       if(i==2){
          break;
      }
       
    }
     for (int k = 0; k < a.length; k++) {
      System.out.println(a[k]);
    }
    System.out.println("Second largest Element is " + a[a.length-2]);
  }
}
