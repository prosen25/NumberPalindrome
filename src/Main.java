//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome (int number) {

        int reverseNumber = 0;
        int originalNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
            number /= 10;
        }
        return (reverseNumber == originalNumber);
    }
}