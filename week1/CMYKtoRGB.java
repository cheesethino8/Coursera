public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double key = Double.parseDouble(args[3]);
        /*
        double cyan = Math.round(cyanDouble);
        double magenta = Math.round((magentaDouble));
        double yellow = Math.round(yellowDouble);
        double key = Math.round(keyDouble);
        */
        double white = (1 - key);
        double red = (255 * white * (1 - cyan));
        double green = (255 * white * (1 - magenta));
        double blue = (255 * white * (1 - yellow));
        
        System.out.println("red = " + Math.round(red));
        System.out.println("green = " + Math.round(green));
        System.out.println("blue = " + Math.round(blue));
    }
}
