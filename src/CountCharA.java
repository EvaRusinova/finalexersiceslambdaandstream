public class CountCharA {

    public static void main(String[] args) {
        String text = "Аз обичам да пия бозa още от сутринтa, но понякога ми е студена.";
        countCharInText(text);
    }

    private static void countCharInText(String text) {
        char charEn = 'a';
        char charBg = 'а';
        char capitalCharEn = 'А';
        int charTotalAmount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == charEn) {
                charTotalAmount++;

            } else if (text.charAt(i) == charBg) {
                charTotalAmount++;
            } else if (text.charAt(i) == capitalCharEn) {
                charTotalAmount++;
            }
        }
        System.out.println(charTotalAmount);
    }
}