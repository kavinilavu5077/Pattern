public class SquareMax {
    public static void main(String[] args) {
        int n =4;
        for(int i =0;i<=n;i++){
            for(int j =0;j<=n;j++){
                int m = n;
                int k = m- Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(k);
            }System.out.println();
        }
    }
    
}
