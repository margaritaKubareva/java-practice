// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int x, y, z;
        x = 10;
        y = 4;
        z = 8;
        int summa = x + y + z;
        System.out.println(summa);
        int summaExample = 10 + 5 + 2 + x + y + z;
        System.out.println(summaExample);
        //2a(a+b); result?
        int a = 4;
        int b = 3;
        int result = 2 * a * (a + b);
        System.out.println(result);
        int remainder = 10 % 3;
        System.out.println(remainder);

        String firstName = "Margarita";
        String lastName = "Kubareva";
        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(firstName + "" + lastName);
        System.out.printf("My full name is %s %s\n", firstName, lastName);

        String dayOfTheWeek = "Monday";
        String locationOfTheEnd = "home";
        System.out.println(dayOfTheWeek);
        System.out.println(locationOfTheEnd);

    }
}