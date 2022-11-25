package MapExerciseStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        String text = "Здравейте, казвам се Антоан Русинов и съм собственик на компания You Lead, която е и издателство на бордови игри. Към момента имаме три различни игри, както и три книги с предприемаческа насоченост. Продуктите ни целят да направят живота на клиентите ни по-забавен. Най-голямата ни сила е, че върху всяка една от игрите можем да изработваме персонален фирмен брандинг, което прави продуктите ни много подходящи за корпоративни подаръци и събития. Тъй като се стремим към разширяване на пазарите си на международно ниво, в момента търсим контакти с вериги книжарници в Европа и България. Антоан Русинов, издателство на бордови игри. Повече информация на сайта ни youlead.bg ";

        List<String> cleanedPunctuation = RemovePunctuation.punctuation(text);
        List<String> splitText = SplitString.split(String.valueOf(cleanedPunctuation));

        List<String> textModify = new ArrayList<>(splitText);
        System.out.println("1. Original list  with the words, and their duplicates : \n");
        textModify.forEach(System.out::println);

        Map<String, Integer> duplicateWords = textModify.stream().collect(Collectors.toMap(Function.identity(), word -> 1, Math::addExact));

        System.out.println("\n Map with Key an Value  as duplicate count: \n");
        duplicateWords.forEach((key, value) -> System.out.println("Key: " + key + " \n Value as a duplicate count: " + value));
    }
}


//FIRST SOLUTION

// /  private static String [] splitStringToWords(String text) {
//      String [] splitWords = new String[]{};
//
//       for(int i = 0; i <= text.length(); i ++){
//          text = text.replaceAll("[.]", " ");
//          text= text.replaceAll(",", " ");
//           splitWords = text.split(" ");
//       }
//       return splitWords;
//   }


//   private static Map<String, Integer> countWordsRepetition(String [] words) {
//   HashMap <String, Integer> map = new HashMap<>();
//
//    for (String currentWord : words) {
//     if (!map.containsKey(currentWord)) {
//         map.put(currentWord, 1);
//       } else {
//            Integer repetition = map.get(currentWord);
//          map.put(currentWord, ++repetition);
//       }
//  }

//  return map;
// }

//  private static void printMap(Map<?, ?> map) {
//      map.forEach((key, value) -> System.out.println(key + " " + value));
//  }

//}
