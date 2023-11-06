import java.util.ArrayList;
import java.util.List;

public class ComboFinder {
    public static List<String> generateCombinations(List<Character> symbols) {
        List<String> combinations = new ArrayList<>();

        generateCombinationsRecursive(symbols, "", combinations);

        return combinations;
    }

    public static void generateCombinationsRecursive(List<Character> symbols, String currentCombination, List<String> combinations) {
        if (symbols.isEmpty()) {
            combinations.add(currentCombination);
            return;
        }

        for (int i = 0; i < symbols.size(); i++) {
            Character symbol = symbols.get(i);
            List<Character> remainingSymbols = new ArrayList<>(symbols);
            remainingSymbols.remove(i);

            String updatedCombination = currentCombination + symbol;

            generateCombinationsRecursive(remainingSymbols, updatedCombination, combinations);
        }
    }
}
