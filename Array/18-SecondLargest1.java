class SecondLargest{
  public static void main(String args[]) {
    int[] a = { 10, 47, 63, 48, 45, 57, 3, 68, 89 };
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (a[i] > largest) {
        secondLargest = largest;
        largest = a[i];
      } else if (a[i] > secondLargest && a[i] != largest) {
        secondLargest = a[i];
      }
    }
    System.out.println("Second largest Element is " + secondLargest);
  }
}
