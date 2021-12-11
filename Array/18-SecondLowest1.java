class SecondLowest{
  public static void main(String args[]) {
    int[] a = { 10, 47, 63, 48, 45, 57, 3, 68, 89 };
    int lowest = Integer.MAX_VALUE;
    int secondLowest = Integer.MAX_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (a[i] < lowest) {
        secondLowest = lowest;
        lowest = a[i];
      } else if (a[i] < secondLowest && a[i] != lowest) {
        secondLowest = a[i];
      }
    }
    System.out.println("Second lowest Element is " + secondLowest);
  }
}
