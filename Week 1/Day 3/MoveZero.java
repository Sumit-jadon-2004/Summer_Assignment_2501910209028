public class MoveZero{
    public static void Move(int n[]){
        int start = 0;
        for(int i=0; i<n.length; i++){
            if(n[i] != 0){
                n[start] = n[i];
                start++;
            }
        }
        while(start < n.length){
            n[start] = 0;
            start++;
        }
    }
    public static void main(String [] args){
        int n[] = {0,1,0,3,12};
        Move(n);
        for(int i=0; i<n.length; i++){
            System.out.print(n[i] + " ");
        }
    }
}