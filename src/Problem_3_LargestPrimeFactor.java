import java.util.ArrayList;

/**
 * Created by changuito on 2/15/16.
 */

public class Problem_3_LargestPrimeFactor {


    public static void main (String[] args) {
        Problem_3_LargestPrimeFactor findPrime = new Problem_3_LargestPrimeFactor(600851475143L);
        findPrime.getAllFactors();
        System.out.println("The factors are: " + findPrime.factors );
        System.out.println("The max prime factor is: " + findPrime.maxPrimeFactor);
    }


    private long number = 0;
    private ArrayList<Long> factors = new ArrayList();
    //private ArrayList primeFactors = new ArrayList();
    private long maxPrimeFactor = 0;

    public Problem_3_LargestPrimeFactor (long num) {
        this.number = num;

    }

    public void getAllFactors () {
        getFactors(this.number);
        getMaxPrimeFactor(this.factors);
    }

    private void getFactors(long number) {
        for (long i = 2; i <= number / 2; i++) {
                if (number % i ==0)
                    this.factors.add(number / i);
                    
        }
    }

    //checks whether an int is prime or not.
    private boolean isPrime(long n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(long i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    private void getMaxPrimeFactor(ArrayList factorsList) {
        for (long factor : this.factors
             ) {
            if (isPrime(factor)) {
                this.maxPrimeFactor = factor;
                break;
            }
        }
    }
}

