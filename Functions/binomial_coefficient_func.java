package Functions;

public class binomial_coefficient_func {

    public static int fact(int n){
        int f= 1;

        for(int i=1; i<=n; i++){
            f= f*i;
       }
       return f;
    } 

    public static int bin_coeff(int n, int r){
        int n_fact= fact(n);
        int r_fact= fact(r);
        int nmr_fact= fact(n-r);

        int bin_coeff= n_fact/ (r_fact * nmr_fact);

        return bin_coeff;
    }

    public static void main(String args[]) {
        System.out.println(bin_coeff(5,2));
        
    }
    
}
