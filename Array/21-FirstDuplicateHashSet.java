import java.util.HashSet;
import java.util.Set;

class FirstDuplicate {

  public static void main(String args[]) {
    int[] a = { 10, 20, 30, 10, 30, 50, 90, 80 };
    //temp takes -1 because no negative array index can be possible
    int temp = -1;
    Set<Integer> hs = new HashSet<>();
    for (int i = a.length - 1; i >= 0; i--) {
      //hs.contains(a[i]): It checks the a[i] present in hashset or not
      if (hs.contains(a[i])) {
        temp = i;
      } else {
        hs.add(a[i]);
      }
    }
    if (temp == -1) {
      System.out.println("No any Duplicate element are found");
    } else {
      System.out.println("First Duplicate elemnt is :" + a[temp]);
    }
  }
}
