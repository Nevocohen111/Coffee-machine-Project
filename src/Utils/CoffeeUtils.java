package Utils;
import com.nevo.Coffee.Coffee;
import com.nevo.Coffee.Ingredient;
import com.nevo.Coffee.Recipe;

public class CoffeeUtils {

    public static void mixIt(Recipe recipe) {
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %20s","ingredient","Quantity");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------");

        recipe.getCommonIngredients().forEach(ingredient -> {;
            System.out.printf("%10s %20s",ingredient.getName(),ingredient.getQuantity());
            System.out.println();
        });
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("\nGrinding coffee beans");
        System.out.println("Mixing ingredients...");
        System.out.println("Filling up the cup");
        System.out.println("\nEnjoy your coffee");
    }

    public static void printOrderCoffee(Coffee coffee) {
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %20s %20s %15s","Type","Machine","Level","Cup");
        System.out.println();

        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.printf("%10s %20s %20s %15s",coffee.getDrinkType(),coffee.getMachineType(),coffee.getDrinkLevel(),coffee.getSize());
    }

    public static void price(Coffee coffee,Recipe recipe) {
        double price = 0;
        for (Ingredient ingredient : recipe.getCommonIngredients()) {
            price += ingredient.getPrice();
        }

        price+=coffee.getSize().getPrice();
        System.out.println("Your bill is: "+price + "$" + " thank you for your order!");
    }
}
