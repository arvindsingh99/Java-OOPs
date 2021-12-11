import java.util.Set;
import java.util.Map;
import java.util.HashMap;
class NonRepeatedElement{
    public static void main(String args[]) {
        int[] a = { 10,20,30,20,30,40,50};
        System.out.println("Non Repeated Elements are:");
        Map<Integer, Integer> hm = new HashMap<>();
        for(int num:a){
            Integer count = hm.get(num);
            if(count==null){
                hm.put(num,1);
            }
            else{
                count = count+1;
                hm.put(num,count);
            }
        }
         Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
        for(Map.Entry<Integer, Integer> ms:es){
            if(ms.getValue()==1){
                System.out.println(ms.getKey()+" ");
            }
            
        }
    }
}
