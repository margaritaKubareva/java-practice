public class Method {
    public static void main(String[] args) {
    printSomeText(10, "Acodemy");
    printSomeText(5, "Test");

        System.out.println(calculateSumOfNumbers(20, 40));


    }

    public static void printSomeText(int loopCount, String text) {
        for (int i = 0; i < loopCount; i++) {
            System.out.println(text);
        }
            }
            public static int calculateSumOfNumbers(int firstNumber, int secondNumber) {
                return firstNumber + secondNumber;

            }

            public static void printInfo(String name, String lastname, int age) {
                System.out.printf("My Name is %s. My surname is %s. I am %d years old.\n", name, lastname, age);



        }
            }

