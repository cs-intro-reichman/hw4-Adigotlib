import java.util.Arrays;

public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [] isprime = new boolean[n+1];
        Arrays.fill(isprime, true);
        int p = 2;
        isprime [0] = false;
        if ((n+1)> 1)
        {
            isprime [1] = false;
        }
        // check where primes
        while ( p * p < (n+1))
        {
            if (isprime[p])
            {
                for (int i = p*p; i < n+1; i +=p)
                {
                    isprime[i] = false; 
                }
            } 
            p++; 
        }
        // print all primes and check how muh precent
        int count = 0;
        System.out.println("Prime numbers up to " + n +":");
        for (int z = 0; z < n+1; z++)
        {
            if (isprime [z])
            {
                System.out.println(z);
                count ++;
            }
        }

        int precent = (int)((100.0 * count) / (n));
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + precent + "% are primes)");

      
    }
}