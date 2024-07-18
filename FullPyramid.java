public class FullPyramid {
    public static void main(String args[]){
        int n = 5;
        for(int i =0;i<n;i++){
            int space = n-i-1;
            for(int j =0;j<space;j++){
                System.out.print(" ");
            }

            int star = i;
             for(int j =0;j<star;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    
}
