class LinearSearch{
    public static void main(String args[]) {
        int[] a = {10,43,348,475,34,36,53,4,33,45};
        int item = 3543,temp=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==item){
                System.out.println("Item Found and its Index Position is:" + i);
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("Item not Found");
        }
    }
}