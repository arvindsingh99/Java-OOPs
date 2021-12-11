class BinarySearch {

  public static void main(String[] args) {
    int[] a = { 10, 20, 30, 40, 50, 70, 80, 90 };
    int item = 30;
    int li = 0;
    int hi = a.length-1;
    int mi = (hi+li)/2;
    while(li <= hi) {
      if(a[mi] == item) {
        System.out.println("Item is at the Index :" + mi);
        break;
      } else if(a[mi]<item) {
        li = mi + 1;
      } else {
        hi = mi - 1;
      }
      mi=(hi+li)/2;
    }
    if (li > hi) {
      System.out.println("Item not Found");
    }
  }
}
