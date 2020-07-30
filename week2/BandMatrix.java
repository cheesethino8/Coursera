public class BandMatrix {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int i;
        int j;
        for (j = 0; j < n; j++) {

            for (i = 0; i < n; i++) {
                int distance = Math.abs(i - j);

                if (i == j || width >= distance) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}
