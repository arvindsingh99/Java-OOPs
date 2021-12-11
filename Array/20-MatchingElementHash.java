import java.util.Set;
import java.util.HashSet;
class MatchingElement{
    public static void main(String args[]) {
        int[] a = { 10,20,45,10,13,18,90,18,23,23,45,10};
        System.out.println("Duplicate elements are:");
        Set<Integer> s = new HashSet<>();
        for(int num:a){
            //add() method returns boolean value
            boolean b = s.add(num);
            if(b==false){
                System.out.println(num);
            }
        }
    }
}