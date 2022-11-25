import java.util.ArrayList;
import java.util.List;

public class SplitWordsByComma {
    public static void main(String[] args) {
        String text = " Здравейте, казвам се Антоан Русинов и съм собственик на компания You Lead, която е и издателство на бордови игри. Към момента имаме три различни игри, както и три книги с предприемаческа насоченост. Продуктите ни целят да направят живота на клиентите ни по-забавен. Най-голямата ни сила е, че върху всяка една от игрите можем да изработваме персонален фирмен брандинг, което прави продуктите ни много подходящи за корпоративни подаръци и събития. Тъй като се стремим към разширяване на пазарите си на международно ниво, в момента търсим контакти с вериги книжарници в Европа и България. Антоан Русинов, издателство на бордови игри. Повече информация на сайта ни youlead.bg ";

        String deletedPunctuation = deletePunctuation(text);
        System.out.println(deletedPunctuation);
        List<String> wordsLists = saveWordsAsList(deletedPunctuation);
        splitWordsByComma(wordsLists);
        ///Still working on this exam, for now it is not working properly. I will commit the final code once when it's done :)
    }

    private static String deletePunctuation(String text) {

        text = text.replaceAll("\\.", " ");
        text = text.replaceAll(",", " ");
        text = text.replaceAll("!", " ");

        return text;
    }

    public static void splitWordsByComma(List<String> text) {

        int counter = 0;
        for (int i = 0; i <= text.size();  ++i) {
            //counter++;
            if (i == 9){
                String currentWord = text.get(9);
                text.set(9, currentWord + "," );
                i = 0;

            }
        }
        System.out.println(text);
    }

    public static List<String> saveWordsAsList(String text) {
        List<String> wordsList = new ArrayList<>() {
        };
        for (int i = 0; i < text.length(); ++i) {
            wordsList.add(String.valueOf(i));
        }
        return wordsList;
    }
}
