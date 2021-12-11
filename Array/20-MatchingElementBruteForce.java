class MatchingElement{
    public static void main(String args[]) {
        int[] a = { 10,20,45,10,13,18,90,18,23,23,45,10};
        System.out.println("Duplicate elements are:");
        for(int i = 0; i < a.length-1; i++){
            for (int j=i+1; j < a.length; j++){
                if(a[i]==a[j]){
                    System.out.println(a[i] + " ");
                }
                
            }
        }
    }
}