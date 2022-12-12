import java.util.ArrayList;
import java.util.List;

public class SplitWordsByComma {
    public static void main(String[] args) {
        String text = "обичам крася ухая голям малък какъв колко какво дете куче";
        List<String> listedWords = new ArrayList<>(MapExercise.split(text));
        System.out.println(listedWords);
        ///Calling  another class, who owns the method, because the solution is the same.

    }

}



