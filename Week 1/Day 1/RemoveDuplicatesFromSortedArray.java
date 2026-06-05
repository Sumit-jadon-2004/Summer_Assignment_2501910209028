public class RemoveDuplicatesFromSortedArray {
    public static int RemoveDuplicateValue (int n[]){
        int j = 0;
        for(int i=1; i<n.length; i++){
            if(n[i] != n[j]){
                j++;
                n[j] = n[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int n[] = {1,1,2};
        int k = RemoveDuplicateValue(n);
        for(int i=0; i<k; i++){
            System.out.print(n[i]);
        }
    }
}
