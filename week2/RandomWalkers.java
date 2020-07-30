public class RandomWalkers {
    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]); // distance that you have to be from the starting point
        int trails = Integer.parseInt(args[1]); // how many times to run the walking part

        int x; // x position of the "walker"
        int y; // y postion of the "walker"
        boolean rDistance; // is Distance from starting point equal to "r"
        int xAbs; // absolute value of x, used to calculate r
        int yAbs; // absolute value of y, used to calculate r
        int randomInt = 0; // random integer, used to decide random direction
        double steps = 0; // init steps variable
        double avgSteps; // init average steps variable

        for (int i = 0; i < trails; i++) { // run until i is equal to the amount of trials needed
            x = 0; // reset x value
            y = 0; // reset y value
            rDistance = false; // reset rDistance boolean
            xAbs = 0; // reset x absolute value
            yAbs = 0; // reset y absolute value
            while (!rDistance) { // if rDistance has not been reached, start stepping
                double randomDouble; // define a random double value, used to calculate direction
                randomDouble = Math.random();
                if (randomDouble
                        < 0.25) { // divide randomDouble to 4 quadrants, used to assign a random value of 0-3 to randomInt
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
                switch (randomInt) { // see which was the person should "walk"
                    case 0:
                        x += 1; // move towards a direction
                        steps++; // add another step
                        xAbs = Math.abs(x); // calculate absolute value of the current x position
                        if (xAbs + yAbs == r) { // check if r has been reached
                            rDistance = true; // if yes, set rDistance to true<
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

            }
        }
        avgSteps = (steps / trails); // calculate average steps
        System.out
                .println("average number of steps = " + avgSteps); // print average steps to console
    }
}
