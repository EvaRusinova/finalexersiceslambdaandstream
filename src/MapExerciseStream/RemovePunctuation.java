package MapExerciseStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemovePunctuation {

    public static List<String> punctuation(String arg) {

        return Stream.of(arg.replaceAll("\\p{Punct}", ""))
                .map(String::new)
                .collect(Collectors.toList());
    }
}



