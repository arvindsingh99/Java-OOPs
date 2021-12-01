class BubbleSort{
    public static void main(String args[]){
        int[] a = {10,20,30,40,50,80,43,76};
        for(int i=0; i<a.length; i++){
            int flag=0;
            for(int j=0; j<a.length-1-i; j++){
                  if(a[j]>a[j+1])
                  {
                      flag = 1;
                      int temp = a[j];
                      a[j] = a[j+1];
                      a[j+1] = temp;
                  }

            }
            if(flag==0){
                break;
            }
        }
        for(int i=0;i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}