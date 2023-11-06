import java.util.ArrayList;
import java.util.List;
//Remake of the C# version
public class Main {
    public static void main(String[] args) {
        List<Character> symbols = new ArrayList<>() {{
            add('A');
            add('B');
            add('C');
            add('A');
        }};

        List<String> combinations = ComboFinder.generateCombinations(symbols);

        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}

