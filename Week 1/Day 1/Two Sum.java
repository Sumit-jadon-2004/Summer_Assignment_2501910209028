class Sum {
    public static void TwoSum(int n[]){
        int target = 9;
        for(int i=0; i<n.length; i++){
            for(int j=i+1; j<n.length; j++){
                 if(n[i] + n[j] == target){
                    System.out.print("("+ i + "," + j +")");
                    return;
                 }
            }
        }
    }
    public static void main(String[] args) {
        int n[] = {2,3,5,4,6,8};
        TwoSum(n);
    }
}