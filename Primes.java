public class Primes {
  public static boolean uglyPrimes(int n) {

    while(n % 2 == 0) {
      n /= 2;
    }

    if (n == 1 || n == 3 || n == 5) return true;


    while(n % 3 == 0) {
      n /= 3;
    }

    if (n == 1 || n == 5) return true;


    while(n % 5 == 0) {
      n /= 5;
    }

    if (n == 1) return true;

    return false;
  }

  public static void main(String args[]) {

    System.out.println("15: " + Primes.uglyPrimes(15));
    System.out.println("33: " + Primes.uglyPrimes(33));
    System.out.println("1: " + Primes.uglyPrimes(1));
    System.out.println("30: " + Primes.uglyPrimes(30));
    System.out.println("39: " + Primes.uglyPrimes(39));
  }
}
