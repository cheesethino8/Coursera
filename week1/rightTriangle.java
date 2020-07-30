public class RightTriangle {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]); // assign 1st argument as int a
        int b = Integer.parseInt(args[1]); // assign 2nd argument as int b
        int c = Integer.parseInt(args[2]); // assign 3rd argument as int c


        int aSqr = (int) Math.pow(a, 2); // square a
        int bSqr = (int) Math.pow(b, 2); // square b
        int cSqr = (int) Math.pow(c, 2); // square c
/* Illegal way of doing it, but it's correct :(
        if ((aSqr + bSqr) == cSqr) { // check if sum of aSqr and bSqr equals to cSqr
            System.out.println("True");
        }
        else if ((aSqr + cSqr) == bSqr) {
            System.out.println("True");
        }
        else if ((cSqr + bSqr) == aSqr) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
*/
        boolean isRightAngle;

        isRightAngle = (((a > 0) && (b > 0) && (c > 0)) &&
                ((aSqr + bSqr == cSqr) || (aSqr + cSqr == bSqr) || (cSqr + bSqr == aSqr)));
        
        System.out.println(isRightAngle);
    }
}
