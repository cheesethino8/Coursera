public class greatCircle {
    public static void main(String[] args) {

        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double r = 6371.0;

        double x1Rad = Math.toRadians(x1);
        double y1Rad = Math.toRadians(y1);
        double x2Rad = Math.toRadians(x2);
        double y2Rad = Math.toRadians(y2);
/* Used for testing purposes
        double r2 = (r * 2);
        double x1Cos = (Math.cos(x1Rad));
        double x2Cos = (Math.cos(x2Rad));
        double xSin = (Math.pow(Math.sin((x2Rad - x1Rad) / 2), 2));
        double ySin = (Math.pow(Math.sin((y2Rad - y1Rad) / 2), 2));
        double sqrt = (Math.sqrt(xSin + x1Cos * x2Cos * ySin));

        double distance = (r2 * Math.asin(sqrt));
        */
        double distance = ((2 * r) *
                Math.asin(
                        Math.sqrt(
                                Math.pow(Math.sin(
                                        (x2Rad - x1Rad) / 2)
                                        , 2) +
                                        Math.cos(x1Rad) * Math.cos(x2Rad) *
                                                Math.pow(Math.sin(
                                                        (y2Rad - y1Rad) / 2), 2)
                        )));

        System.out.println(distance + " Kilometers.");
    }
}
