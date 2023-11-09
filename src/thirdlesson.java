public class thirdlesson {
    public static void main(String[] args) {

        //loop
        // for loop
        /*
        for(counter; condition; counter change) {

        }
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }
        /*
        i = 0; i<10; i++
         */
        //Print numbers from 1-5
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i);
        }
        //Print numbers 10-0
        for (int i = 10; i > 0 ; i--) {

        }
        String[] arrayOfNames = {"Nikita", "John", "Mike", "Anthony", "Mary", "Ann"};
        //arrayOfNames[0] -> System.out.println();
        //arrayOfNames[1]
        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.println(arrayOfNames[i]);
        }

        //for each

        for (String name : arrayOfNames) {
            System.out.println(name);
        }
        String[] countries = { "United States",
                "Canada",
                "United Kingdom",
                "Germany",
                "France",
                "Australia",
                "Japan",
                "India",
                "China",
                "Brazil"
        };
        //goal: find japan in our array!

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Japan")) {
                System.out.println("JAMETE KUDASAI");
                break;
            }
            System.out.println(countries[i]);
        }
        //3 numbers array

        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {3, 4, 5, 6, 7};
        int[] thirdArray = {5, 6, 7, 8, 9};

        for (int numberOfFirstArray : firstArray) {

            for (int numberOfSecondArray : secondArray) {
                for (int numberOfThirdArray : thirdArray) {
                    if (numberOfFirstArray == numberOfSecondArray && numberOfSecondArray == numberOfThirdArray) {
                        System.out.println(numberOfThirdArray);
                    }
                }
            }
        }

        //from 0-100
        //print even numbers
        //for-> iterate 0-100
        //if-> this is even number, we print it!

        int number = 51;
                boolean isEven = number % 2 == 0;
        System.out.println(isEven);

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //while -> do while!

        /*
        while(condition){
        //execute code block;
        }
         */

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        //calculate the sum of numbers 1-5 using while loop

        int x = 1;
        int summa = 0;
        while (x <= 5) {
           summa = summa + x;
            x++;
        }
        System.out.println("Summa:" + summa);

        //print even numbers 0-20

        int y = 0;
        while (y <= 20) {
            System.out.println(y + "");
            y = y + 2;
        }


        /*

        do {
        //execute code block
       }while(condition)
         */

        int z = 1;
        do {
            System.out.println(z);
            z++;
        } while (z <= 5);

        // feature/homework solution




    }
}
