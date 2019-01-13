package com.training.karol;

public class Barman {

     public static Drink createDrink(String ingredient1,int amount1,String ingredient2,int amount2,String ingredient3,int amount3){

         Ingredient ingred1 = new Ingredient(ingredient1,amount1);
         Ingredient ingred2 = new Ingredient(ingredient2,amount2);
         Ingredient ingred3 = new Ingredient(ingredient3,amount3);

         return  new Drink(ingred1,ingred2,ingred3);
     }



    public static void printDrink(Drink drink){
        double ingredientSum = drink.getIngredient1().getAmount() +
                drink.getIngredient2().getAmount() +
                drink.getIngredient3().getAmount();
        double ing1Part = drink.getIngredient1().getAmount() / ingredientSum;
        double ing2Part = drink.getIngredient2().getAmount() / ingredientSum;
        double ing3Part = drink.getIngredient3().getAmount() / ingredientSum;
        System.out.printf("Składniki drinka to: %s, %s, %s " +
                        "w proporcjach %.2f, %.2f, %.2f." +
                        "Jego pojemność to %.0fml\n",
                drink.getIngredient1().getIngredientType(), drink.getIngredient2().getIngredientType(), drink.getIngredient3().getIngredientType(),
                ing1Part, ing2Part, ing3Part,
                ingredientSum);
    }
}
