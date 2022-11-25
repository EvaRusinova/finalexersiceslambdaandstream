import java.util.Scanner;

public class IdenticalTextsTest {
    public static void main(String[] args) {
        Scanner scanTexts = new Scanner(System.in);

        String firstText = scanTexts.nextLine();

        String secondText = scanTexts.nextLine();

        identicalTextsTest(firstText, secondText);
    }

    private static void identicalTextsTest(String textOne, String textTwo) {
        int compareTexts = textOne.compareTo(textTwo);
        if (compareTexts == 0) {
            System.out.println("Both texts are identical");
        } else {
            System.out.println("Not matching");
        }

    }
}
