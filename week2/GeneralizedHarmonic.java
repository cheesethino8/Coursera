public class GeneralizedHarmonic {
    public static void main(String[] args) {

        int i;
        double sum = 0;

        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        for (i = 1; i <= n; i++) {

            sum = sum + (1 / Math.pow(i, r));

        }
        System.out.println(sum);

    }
}
