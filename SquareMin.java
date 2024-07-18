public class SquareMin {
    public static void  main (String args[]){
        int n = 7;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                int k = Math.min(Math.min(i,j),Math.min(n-i-1,n-j-1));
                System.out.print(k);
            }System.out.println();
        }
    }
    
}
