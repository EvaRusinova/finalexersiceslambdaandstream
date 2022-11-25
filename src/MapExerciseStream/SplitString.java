package MapExerciseStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SplitString {
    public static List<String> split(String arg) {

        return Stream.of(arg.split(" "))
                .map(String::new)
                .collect(Collectors.toList());
    }
}


    
