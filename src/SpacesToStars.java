public class SpacesToStars {
    public static void main(String[] args) {
        String text = "Thank you for being our customer for so long!";
        System.out.println(replaceSpaces(text));

    }

    private static String replaceSpaces(String text) {
        return text.replaceAll(" ", "*");
    }
}
