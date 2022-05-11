import java.util.Arrays;

public class ReId {
    public static void main(String[] args) {
        System.out.println("i = 0 :: " + solution(0).equals("23571"));
        System.out.println("i = 3 :: " + solution(3).equals("71113"));
    }

    public static String solution(int i) {

        boolean isPrime[] = new boolean[i + 5];
        Arrays.fill(prime, true);

        int sizeSoFar = 0;
        int primeNumberCount = 0;

        for (int j = 2; j * j <= (i + 5); j++) {
            if (isPrime[j]) {
                for (int k = j * 2; k < (i + 5); k += j) {
                    isPrime[k] = false;
                }

                primeNumberCount += 1;
                sizeSoFar += String.valueOf(j).length();

                if (sizeSoFar > (i + 5)) {
                    break;
                }
            }
        }

        StringBuilder primeBuilder = new StringBuilder();

        for (int j = 2; j <= (primeNumberCount); j++) {
            if (isPrime[i]) {
                primeBuilder.append(String.valueOf(j));
            }
        }

        char[] id = new char[5];
        primeBuilder.getChars(i, 5, id, 0);

        return id.toString();
    }

}
