public class HelloGoodbye {
    public static void main(String[] args) {
        System.out.println(
                "Hello " + args[0] + " and " + args[1] + "."); // Prints "Hello,  name1 and name 2"
        System.out.println("Goodbye " + args[1] + " and " + args[0] + ".");
    }
}
