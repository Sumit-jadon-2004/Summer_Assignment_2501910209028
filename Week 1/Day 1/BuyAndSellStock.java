public class BuyAndSellStock {
    public static int BuyStock (int n[]){
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0; i<n.length; i++){
            if(n[i] <= min){
                min = n[i];
            }else{
                max = Math.max(max , n[i] - min);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int n[] = {7,1,5,3,6,4};
        System.out.println(BuyStock(n));
    }
}
