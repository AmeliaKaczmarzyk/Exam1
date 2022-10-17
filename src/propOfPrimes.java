public class propOfPrimes {
    public static boolean isPrimeNumber(int num) {
        for (int i = 2; i <= (Math.sqrt(num + 1)); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double propOfPrimes(int start, int end){
        double amountOfPrime = 0;
        double amountOfComposite = 0;
        for(int i = start; i <= end; i++) {
            if (isPrimeNumber(i)){
                amountOfPrime++;
            }
            else{
                amountOfComposite++;
            }
        }
        return amountOfPrime/(amountOfComposite + amountOfPrime);
    }

    public static void main(String[] args) {
        System.out.println(propOfPrimes(5, 14));
    }
}
