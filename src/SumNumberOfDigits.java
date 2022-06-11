import java.util.Scanner;

public class SumNumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number..:"); //1634
        int number = scanner.nextInt();
        String numberOfString = String.valueOf(number);
        int totalResult = 0;
        for (int i = 0; i < numberOfString.length(); i++) {
            totalResult += Integer.valueOf(numberOfString.substring(i, i + 1));
            System.out.print(numberOfString.substring(i, i + 1) + ((numberOfString.length() - 1 == i) ? "" : " + "));
        }
        System.out.print(" = " + totalResult);
    }
}

//1634 => "1634"
