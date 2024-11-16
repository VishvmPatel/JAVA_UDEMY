import java.util.*;

public class Potion{
    private static final Map<String, List<List<String>>> potionRecipes = new HashMap<>();
    private static final Map<String, Integer> calculatedOrbs = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRecipes = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < numberOfRecipes; i++) {
            String[] parts = scanner.nextLine().trim().split("=");
            String potionName = parts[0].trim();
            String[] ingredients = parts[1].trim().split("\\+");
            potionRecipes.putIfAbsent(potionName, new ArrayList<>());
            potionRecipes.get(potionName).add(Arrays.asList(ingredients));
        }
        String targetPotion = scanner.nextLine().trim();
        System.out.print(calculateMinOrbs(targetPotion));
        scanner.close();
    }
    private static int calculateMinOrbs(String potion) {
        if (!potionRecipes.containsKey(potion)) {
            return 0;
        }
        if (calculatedOrbs.containsKey(potion)) {
            return calculatedOrbs.get(potion);
        }
        int minimumOrbs = Integer.MAX_VALUE;
        for (List<String> recipe : potionRecipes.get(potion)) {
            int orbsRequired = recipe.size() - 1;
            for (String ingredient : recipe) {
                orbsRequired += calculateMinOrbs(ingredient);
            }
            minimumOrbs = Math.min(minimumOrbs, orbsRequired);
        }
        calculatedOrbs.put(potion, minimumOrbs);
        return minimumOrbs;
    }
}
