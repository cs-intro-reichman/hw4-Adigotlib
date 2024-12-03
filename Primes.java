import java.util.Arrays;

public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [] isprime = new boolean[n];
        Arrays.fill(isprime, true);
        int p = 2;
        isprime [0] = false;
        isprime [1] = false;
        // check where primes
        while ( p * p < n)
        {
            if (isprime[p])
            {
                for (int i = p*p; i < n; i +=p)
                {
                    isprime[i] = false; 
                }
            } 
            p++; 
        }
        // print all primes and check how muh precent
        int count = 0;
        System.out.println("Prime numbers up to " + n +":");
        for (int z = 0; z < n; z++)
        {
            if (isprime [z] == true)
            {
                System.out.println(z);
                count ++;
            }
        }
        int precent = (int)((100.0 * count) / n);
        System.out.println("There are " + count + " primes between 2 and " + n + ". (" + precent + "% are primes)");

      
    }
}