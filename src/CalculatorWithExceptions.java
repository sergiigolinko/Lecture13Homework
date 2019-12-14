import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalculatorWithExceptions {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int option = -1;
        System.out.println("Please enter the numbers");
        while (true && option != 0) {
            int a = nextInt();
            int b = nextInt();
            System.out.println("Please choose an option: 1 - addition; 2 - deduction; 3 - multiplication; 4 - division; 5 -exit");
            option = SCANNER.nextInt();
            switch (option) {
                case 1: {
                    if (a < 0 || b < 0) {
                        throw new Exception("Numbers must be positive!");
                    }
                    addition(a, b);
                    break;
                }
                case 2: {
                    if (a < b) {
                        throw new Exception("The first number must be larger than the second!");
                    }
                    deduction(a, b);
                    break;
                }
                case 3: {
                    if (a == 0 || b == 0) {
                        throw new Exception("Both numbers must not be equal to zero!");
                    }
                    multiplication(a, b);
                    break;
                }
                case 4: {
                    if (b == 0) {
                        throw new Exception("Zero is not allowed!");
                    }
                    division(a, b);
                    break;
                }
                case 5: {
                    System.exit(5);
                    break;
                }
                default: {
                    System.out.println("Option not found!");
                }
            }
        }
    }


    private static void addition(int a, int b) {

        int sum = a + b;
        System.out.println(sum);

    }

    private static void deduction(int a, int b) {
        int ded = a - b;
        System.out.println(ded);
    }

    private static void multiplication(int a, int b) {
        int mult = a * b;
        System.out.println(mult);
    }

    private static void division(int a, int b) {
        int div = a / b;
        System.out.println(div);
    }

    private static int nextInt() {
        boolean ok = false;
        int i = 0;
        while (!ok) {
            try {
                i = next();
                ok = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter the number!\nTry again");
            } catch (IOException e) {
                // ignore
            }
        }
        return i;
    }

    private static int next() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }


}
