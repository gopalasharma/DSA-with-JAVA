package Advance_Pattern;

public class butterfly_pattern {

    public static void butterfly(int n){

        // For upper part.

        // outer loop.
        for(int i=1; i<=n; i++){

            // inner loop

            // stars= i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            // spaces= 2*(n-1)
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            // stars= i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // For lower part.

        // outer loop
        for(int i=n; i>=1; i--){

            // inner loop

            // stars= i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            // spaces= 2*(n-1)
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            // stars= i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return;
        
    }

    public static void main(String[] args) {
        butterfly(4);
        
    }
    
}
