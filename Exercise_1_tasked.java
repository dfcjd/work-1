import java.util.*;

public class Exercise_1_tasked {

    public static int size;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the pattern: ");
        size = sc.nextInt();
        System.out.print("Enter the pattern (1-7): ");
        int typeInput = sc.nextInt();
        switch (typeInput) {
            case 1:
                PatternA();
                break;
            case 2:
                PatternB();
                break;
            case 3:
                PatternC();
                break;
            case 4:
                PatternD();
                break;
            case 5:
                PatternE();
                break;
            case 6:
                PatternF();
                break;
            case 7:
                PatternG();
                break;
            case 8:
                PatternH();
                break;
            default:
                System.out.println("Pattern does not exists.");
        }
        sc.close();
        /*
         * int t = -10%3;
         * System.out.println(t);
         * outputs -1
         * a random fact by Dean.
         */
    }

    public static int x;
    public static int y;

    // basic for for loop
    static void PatternA() {
        for (y = 0; y < size; y++) {
            for (x = 0; x < size; x++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    // for while loop
    static void PatternB() {
        for (y = 0; y < size; y++) {
            x = 0;
            while (x < size) {
                if (y > 0 && y < size - 1) {
                    if (x > 0 && x < size - 1) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                }
                x++;
            }
            System.out.println(" ");
        }

        System.out.println("");

    }

    // for do-while loop
    static void PatternC() {
        for (y = 0; y < size; y++) {
            x = 0;
            do {
                System.out.print("* ");
                x++;
            } while (x <= y);
            System.out.println(" ");
        }
        System.out.println("");

    }

    // while for loop (recycling code is good for the enviroment)
    static void PatternD() {
        while (y < size) {
            if (y > 0 && y < size - 1) {
                for (x = 0; x <= y; x++) {
                    if (x > 0 && x < y) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
            } else {
                for (x = 0; x <= y; x++) {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
            y++;
        }
        System.out.println("");
    }

    static void PatternE() {
        for (y = 0; y < size; y++) {
            for (x = 0; x <= y; x++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (y = size; y >= 0; y--) {
            for (x = y; x >= 0; x--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

    static void PatternF() {
        for (y = 0; y < size; y++) {
            for (x = 2 * ((size - 1) - y); x >= 0; x--) {
                System.out.print(" ");
            }

            for (x = 0; x <= y; x++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("");

    }

    static void PatternG() {
        for (y = 0; y < size; y++) {
            for (x = 2 * ((size - 1) - y); x >= 0; x--) {
                System.out.print(" ");
            }
            x = 0;
            while (x <= y) {
                if (y > 0 && y < size - 1) {
                    if (x > 0 && x <= y - 1) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                }
                x++;
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

    // Parallelogram :)
    static void PatternH() {
        for (y = 0; y < size; y++) {
            for (x = 2 * ((size - 1) - y); x >= 0; x--) {
                System.out.print(" ");
            }
            x = 0;
            while (x < size) {
                if (y > 0 && y < size - 1) {
                    if (x > 0 && x < size - 1) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                }
                x++;
            }
            System.out.println(" ");
        }
        System.out.println("");
    }
}
