import java.util.ArrayList;
class OddEvenElements{
    public static void main(String args[]) {
        int[] a = {1,3,4,5};
        ArrayList<Integer> a1= new ArrayList<>();
        ArrayList<Integer> a2= new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
               a1.add(a[i]);
            }
            else{
                 a2.add(a[i]);
            }
        }
        System.out.println("All Even Elemnts are: ");
        for(int num:a1){
          System.out.println(num);
        }
        System.out.println("No. of Even Elements are:" + a1.size());
        System.out.println("All Even Elements are: ");
        for(int num:a2){
          System.out.println(num);
        }
        System.out.println("No. of Odd Elements are:" + a1.size());
    }
}