import java.util.Arrays;

public class ReId {
    public static void main(String[] args) {
        System.out.println("i = 0 :: " + solution(0).equals("23571"));
        System.out.println("i = 3 :: " + solution(3).equals("71113"));
        System.out.println("i = 12 :: " + solution(12).equals("23293"));
        System.out.println("i = 45 :: " + solution(45).equals("71011"));
    }

    public static String solution(int i) {
        StringBuilder primeBuilder = new StringBuilder();
        primeBuilder.append(2);

        for (int j = 3; primeBuilder.length() <= (i + 5); j += 2) {
            if (isPrime(j)) {
                primeBuilder.append(j);
            }
        }

        char[] id = new char[5];
        primeBuilder.getChars(i, (i + 5), id, 0);

        return String.valueOf(id);
    }

    private static boolean isPrime(int num) {
        for (int i = 2; (i * i) <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
