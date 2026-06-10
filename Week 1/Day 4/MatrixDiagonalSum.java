

public  class MatrixDiagonalSum{
    public static int DiagonalSum(int n[][]){
        int sum = 0;
        int l = n.length;
        for (int i=0; i<l; i++){
            sum += n[i][i];
            sum += n[i][l-1-i];
        }
        if(l % 2 == 1){
            sum -= n[l /2][l / 2];
        }
        return sum;
}
public static void main(String args[]){
    int n [][] = {{1,2,3},
                {4,5,6},
                {7,8,9}};
    System.out.println(DiagonalSum(n));
}
}
