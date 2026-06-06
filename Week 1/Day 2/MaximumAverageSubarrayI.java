public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] n, int k) {
        int curr =0 ;
        for(int i=0; i<k; i++){
            curr += n[i];
        }
        int max = curr;
        for(int j=k; j<n.length; j++){
            curr = curr-n[j - k] + n[j];
            max = Math.max(curr , max);
        }
        return (double) max/k;
    }
    public static void main(String args[]){
        int n[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(n, k));
    }
}
