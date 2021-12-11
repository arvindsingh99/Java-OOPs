class MissingElement{
    public static void main(String args[]) {
        int[] a = {1,2,3,4,6};
        int expectedLength = a.length+1;
        int expectedSum = (expectedLength *(expectedLength + 1))/2;
        int sum=0;
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("Missing Elemnt is :" + (expectedSum-sum));
    }
}