
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean Contains(int n[]){{
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n.length; i++){
            if(set.contains(n[i])){
                return true;
            }
            set.add(n[i]);
        } 
    }
    return false;
}
    public static void main(String args[]){
        int n[] = {1,2,3,1};
        System.out.println(Contains(n));
    }
}
