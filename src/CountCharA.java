public class CountCharA {

    public static void main(String[] args) {
        String text = "Аз обичам да пия бозa още от сутринтa, но понякога ми е студена.";
        char aEn = 'a';
        char aBg = 'а';
        char aUppercaseEn = 'A';
        char aUppercaseBG = 'А';
        System.out.println("English char 'a' occurrence " + countChar(text, aEn));
        System.out.println("English char 'A' occurrence " + countChar(text, aUppercaseEn));
        System.out.println("Bulgarian char 'a' occurrence " + countChar(text, aBg));
        System.out.println("Bulgarian char 'A' occurrence " + countChar(text, aUppercaseBG));
    }

    public static long countChar(String text, char a) {
        return text.chars()
                .filter(c -> c == a)
                .count();
    }
}

///FIRST SOLUTION
//   private static void countCharInText(String text) {
//       char charEn = 'a';
//       char charBg = 'а';
//       char capitalCharEn = 'А';
//
//
//    }
//      int charTotalAmount = 0;
//
//       for (int i = 0; i < text.length(); i++) {
//           if (text.charAt(i) == charEn) {
//               charTotalAmount++;
//
//           } else if (text.charAt(i) == charBg) {
//               charTotalAmount++;
//           } else if (text.charAt(i) == capitalCharEn) {
//               charTotalAmount++;
//           }
//       }
//       System.out.println(charTotalAmount);
//   }
//  }