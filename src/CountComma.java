public class CountComma {
    public static void main(String[] args) {

        String text = "Здравейте, " +
                "казвам се Антоан Русинов и съм собственик на компания You Lead, " +
                "която е и издателство на бордови игри. " +
                "Към момента имаме три различни игри," +
                " както и три книги с предприемаческа насоченост." +
                " Продуктите ни целят да направят живота на клиентите ни по-забавен." +
                " Най-голямата ни сила е," +
                " че върху всяка една от игрите" +
                " можем да изработваме персонален фирмен брандинг," +
                " което прави продуктите ни много подходящи за корпоративни подаръци и събития." +
                " Тъй като се стремим към разширяване на пазарите си на международно ниво, " +
                "в момента търсим контакти с вериги книжарници в Европа и България. " +
                "Антоан Русинов, издателство на бордови игри. " +
                "Повече информация на сайта ни youlead.bg ";
        char comma = ',';
        System.out.println("Amount of commas in the text: " + CountCharA.countChar(text, comma));
        //The solution is the same as the solution of the CountCharA exercise.
    }
}

///FIRST SOLUTION
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == comma) {
//                countChar++;
//            }
//        }
//        System.out.println(countChar);
//    }
//}