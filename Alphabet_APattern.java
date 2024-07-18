public class Alphabet_APattern {
    public static void main(String args[]){
        // int n =5;
      
        // for(int i =0;i<n;i++){
        //     for(int j =0;j<n;j++){
        //         if(i==0||j==0||i==2||j==n-1){
        //             System.out.print("*"+" ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }System.out.println();
        //   }
    
    int n=5;
    int v=2*n;
    int k=(2*n)/2;
    for(int i =0;i<v;i++){
        for(int j =0;j<v;j++){
            if((i==0 && j==n)||j==n-i||j==n+i){
                System.out.print("*"+" ");
            }
            else if()
            else{
                System.out.print("  ");
            }
        }System.out.println();
      }
    
    }
}
