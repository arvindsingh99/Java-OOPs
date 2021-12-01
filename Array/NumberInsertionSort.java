class InsertionSort{
    public static void main(String args[]) {
        int temp, min;
        int[] a = {10,01,34,43,223,54};
        for(int i=0; i<a.length;i++){
            min=i;
            for(int j=i+1; j<a.length; j++){
                if(a[j]<a[min]){
                      min=j;
                }
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        for(int k=0; k<a.length;k++){
            System.out.println(a[k]);
        }
    }
}
