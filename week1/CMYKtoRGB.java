public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyanDouble = Double.parseDouble(args[0]);
        double magentaDouble = Double.parseDouble(args[1]);
        double yellowDouble = Double.parseDouble(args[2]);
        double keyDouble = Double.parseDouble(args[3]);

        int cyan = (int) Math.round(cyanDouble);
        int magenta = (int) Math.round((magentaDouble));
        int yellow = (int) Math.round(yellowDouble);
        int key = (int) Math.round(keyDouble);

        int white = (1 - key);
        int red = (255 * white * (1 - cyan));
        int green = (255 * white * (1 - magenta));
        int blue = (255 * white * (1 - yellow));

        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);
    }
}
