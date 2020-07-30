public class RandomWalker {
    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        boolean rDistance = false;
        int xAbs = 0;
        int yAbs = 0;
        int randomInt = 0;
        int steps = 0;
        System.out.println("(" + x + ", " + y + ")"); // starting point

        while (!rDistance) {
            double randomDouble;
            randomDouble = Math.random();
            if (randomDouble < 0.25) {
                randomInt = 0;
            }
            else if (randomDouble < 0.5) {
                randomInt = 1;
            }
            else if (randomDouble < 0.75) {
                randomInt = 2;
            }
            else if (randomDouble < 1) {
                randomInt = 3;
            }
            if (xAbs + yAbs == r) { // check if r has been reached
                rDistance = true; // if yes, set rDistance to true<
            }
            switch (randomInt) {
                case 0:
                    x += 1;
                    steps++;
                    xAbs = Math.abs(x);
                    if (xAbs + yAbs == r) {
                        rDistance = true;
                    }
                    break;
                case 1:
                    x -= 1;
                    steps++;
                    xAbs = Math.abs(x);
                    if (xAbs + yAbs == r) {
                        rDistance = true;
                    }

                    break;
                case 2:
                    y += 1;
                    steps++;
                    yAbs = Math.abs(y);
                    if (xAbs + yAbs == r) {
                        rDistance = true;
                    }
                    break;
                case 3:
                    y -= 1;
                    steps++;
                    yAbs = Math.abs(y);
                    if (xAbs + yAbs == r) {
                        rDistance = true;
                    }
                    break;

            }
            System.out.println("(" + x + ", " + y + ")");
            if (rDistance) {
                System.out.println("Steps = " + steps); // print how many steps it took
            }

        }


    }
}
