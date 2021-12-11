import java.util.Map;
import java.util.HashMap;
import java.util.Set;
class MatchingElement{
    public static void main(String args[]) {
        int[] a = { 10,20,20,40,50,40,50,40,};
        Map<Integer, Integer> hm = new HashMap<>();
        for(int num:a){
           Integer count = hm.get(num);
            if(count==null){
                hm.put(num,1);
            }
            else{
                count=count+1;
                hm.put(num,count);
            }
        }
        System.out.println("Duplicate elements are:");
        Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
        for(Map.Entry<Integer, Integer>ms:es){
            if(ms.getValue()>1){
                System.out.println(ms.getKey()+" ");
            }

        }
    }
}