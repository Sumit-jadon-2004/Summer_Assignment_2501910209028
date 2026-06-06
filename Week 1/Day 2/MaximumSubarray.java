public class MaximumSubarray{
    public static int Subarray(int n[]){
        int maxSum = n[0];
        int currSum = n[0];
        for(int i=1; i<n.length; i++){
            currSum = Math.max(n[i], currSum + n[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        int n[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(Subarray(n));
    }
}