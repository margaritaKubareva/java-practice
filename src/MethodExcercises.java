public class MethodExcercises {
    public static void main(String[] args) {

        System.out.println(fahrenheitConventer(120));
        System.out.println(currencyConventer("CZK", 50));
        System.out.println(currencyConventer("GBP", 50));
        System.out.println(currencyConventer("PLN", 50));

        System.out.println(isPalindrome("radar"));
       // isPalindrome("privet");
        //civic
        //c=0
        //i=1
        //v=2
        //i=3
        //c=4

    }

    public static double fahrenheitConventer(double fahrenheit) {
        return (fahrenheit - 32)/1.8000;

    }

    public static double currencyConventer(String currency, double money) {
        double convertedAmount;
        switch (currency) {
            case "PLN":
               convertedAmount = money * 4.45;
               break;
            case "CZK":
                convertedAmount = money * 24.55;
                break;
            case "GBP":
                convertedAmount = money * 0.87;
                break;
            default: throw new RuntimeException("Unsupported currency:" + currency);
        }
        return convertedAmount;
    }

    public static boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0 ; i--) {
          reversed = reversed + word.charAt(i);
        }
        //System.out.println(reversed);
        //return true;
        return reversed.equals(word);
    }
    public static double calculator (String operation, double firstNumber, double secondNumber){
        double result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            default: throw new RuntimeException()
        }
    }
}


